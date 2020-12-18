/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javathread;

/**
 *
 * @author violaboros.federico
 */
public class Sportello implements Runnable {
    private Conto conto;
    private String utente;
    
    public Sportello(Conto conto, String utente) {
        this.conto = conto;
        this.utente = utente;
    }
    
    @Override
    public void run() {
        System.out.println(utente + " partito: " + conto.saldo());
    }
    
    public void versa(int somma) {
        conto.versa(somma);
    }
    
    public void preleva(int somma) {
        conto.preleva(somma);
    }
    
}
