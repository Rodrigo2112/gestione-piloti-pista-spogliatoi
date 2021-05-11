package com.pista;

import static java.lang.Thread.*;
import java.util.logging.*;

/**
 *
 * @author User
 */
public class Spogliatoio {

    Semaforo s = new Semaforo(2);

    public Spogliatoio() {

    }

    public void indossa(Piloti p) {
        try {
            s.P(); //richiede
            sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Spogliatoio.class.getName()).log(Level.SEVERE, null, ex);
        }
        s.V(); //rilascia
        System.out.println(p.getNome() + " ha indossato la tuta e il casco");
    }

}
