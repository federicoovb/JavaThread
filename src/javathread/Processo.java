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
public class Processo extends Thread {
    private String x;
    
    public Processo(String x){
        this.x = x;
        this.start();
    }
    
    public void run(){
        for (;;) System.out.println(x);
    }
    
}
