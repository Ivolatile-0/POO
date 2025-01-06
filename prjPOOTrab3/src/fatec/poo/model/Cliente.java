package fatec.poo.model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private double limiteCredito;
    private double limiteDisponivel;
    private ArrayList<Pedido> pedidos;
 
    public Cliente (String cpf, String nome, double limiteCredito) {
        super(nome, cpf);
        this.limiteCredito = limiteCredito;
        pedidos = new ArrayList<Pedido>();
    }
    public void setLimiteCredito(double limiteCredito){
        this.limiteCredito = limiteCredito;
    }
    public void setLimiteDisponivel(double limiteDisponivel){
        this.limiteDisponivel = limiteDisponivel;
    }
    public double getLimiteCredito(){
        return limiteCredito;
    }
    public double getLimiteDisponivel(){
        return limiteDisponivel;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p); //método pode ser executado inúmeras vezes de forma indeterminada
    }
    
}