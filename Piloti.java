package com.pista;

/**
 *
 * @author User
 */
public class Piloti implements Runnable {

    private final String nome;
    
    private final Spogliatoio s = new Spogliatoio();
    private final Pista p = new Pista();

    public Piloti(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public void run() {
        s.indossa(this);
        p.gareggia(this);
    }

}
