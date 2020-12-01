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
public class Conto {
    private int totale;
    private int tasse = 100;

    public Conto(int totale) {
        this.totale = totale;
    }
    
    synchronized void versa(int somma){
        totale = totale + somma - tasse;
    }
    
    synchronized int saldo(){
        return totale;
    }
}
