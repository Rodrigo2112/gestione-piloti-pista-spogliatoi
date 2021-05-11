package com.pista;

/**
 *
 * @author User
 */
public class Semaforo {

    int v;

    public Semaforo(int valore) {
        this.v = valore;
    }

    synchronized public void P() throws InterruptedException {
        while (v == 0) {
            wait();
        }
        v--;
    }

    synchronized public void V() {
        v++;
        notify();
    }

}
