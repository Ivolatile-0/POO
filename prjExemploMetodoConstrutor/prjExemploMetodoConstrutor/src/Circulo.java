/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ingrid
 */
public class Circulo {
    private double medraio;
    private String unidadeMedida;
    
    public Circulo(String uniMed){
        unidadeMedida = uniMed;
    }    

    Circulo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double getRaio(){
        return(medraio);
    }
    public double calcArea(){
        return(Math.PI * Math.pow(medraio, 2));
    }
    public double calcPerimetro(){
        return(2 * Math.PI * medraio);
    }
    public double calcDiametro(){
        return(2*medraio);
    }
}
