/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Ingrid
 */
public class Livro {
    private int identificacao;
   private String titulo;
   private boolean situacao;
   private double valMultaDiaria;

    public Livro(int identificacao, String titulo) {
        this.identificacao = identificacao;
        this.titulo = titulo;
    }

    public void setValMultaDiaria(double valMultaDiaria) {
        this.valMultaDiaria = valMultaDiaria;
    }
    
    public int getIdentificacao() {
        return identificacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isSituacao() {
        return situacao;
    }
   
   public void emprestar(){
       situacao = true;
   }
   
   public double devolver(int diasAtraso){
       double valor;
       valor = valMultaDiaria * diasAtraso;
       situacao = false;
       return valor;
   }
}