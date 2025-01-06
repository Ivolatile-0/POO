/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Ingrid
 */
public class Cliente extends Pessoa {
    private int numMesa;
    private double totalConta;
    
    public Cliente(int c, String n, int m, double tc){
        super(c, n);
        numMesa = m;
        totalConta = tc;
    }
    
    public void setTotalConta(double tc){
        totalConta = tc;
    }
    
    public int getNumMesa(){
        return numMesa;
    }
    
    public double getTotalConta(){
        return totalConta;
    }
    
}
