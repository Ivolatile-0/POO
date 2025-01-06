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
public class Garcom extends Pessoa{
    private double salBase;
    private double taxaServico;
    private double totalGorjeta;
    
    public Garcom(int c, String n, double t){
        super(c, n);
        taxaServico = t;
    }
    
    public void setSalarioBase(double sb){
        salBase = sb;
    }
    
    public double getSalarioBase(){
        return salBase;
    }
    
    public double getTaxaServico(){
        return taxaServico;
    }
    
    public double getTotalGorjeta(){
        return totalGorjeta;
    }
    
    public void addGorjeta(double totalConta){
        totalGorjeta += totalConta * taxaServico;
    }
    
    public double calcSalarioFinal(){
        return salBase + totalGorjeta;
    }
   
}
