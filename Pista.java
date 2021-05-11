package com.pista;

import static java.lang.Thread.*;
import java.util.logging.*;

/**
 *
 * @author User
 */
public class Pista {

    Semaforo s = new Semaforo(4);

    public Pista() {

    }

    public void gareggia(Piloti p) {
        try {
            s.P();
            System.out.println(p.getNome() + " è entrato nella pista");
            for (int i = 1; i < 16; i++) {
                sleep(1000);
                System.out.println(p.getNome() + " ha completato il giro " + i);
            }
            System.out.println(p.getNome() + " è uscito dalla pista");
        } catch (InterruptedException ex) {
            Logger.getLogger(Pista.class.getName()).log(Level.SEVERE, null, ex);
        }
        s.V();
    }

}
