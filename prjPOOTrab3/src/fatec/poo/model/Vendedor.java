package fatec.poo.model;

import java.util.ArrayList;

public class Vendedor extends Pessoa{
    private double SalarioBase;
    private double taxaComissao;
    private ArrayList<Pedido> pedidos;
 
    public Vendedor(String cpf, String nome, double SalarioBase) {
        super(nome, cpf);
        this.SalarioBase = SalarioBase;
        pedidos = new ArrayList<Pedido>();
    }
    public void setSalarioBase(double SalarioBase){
        this.SalarioBase = SalarioBase;
    }
    public void setTaxaComissao(double taxaComissao){
        this.taxaComissao = taxaComissao;
    }
    public double getSalarioBase(){
        return SalarioBase;
    }
    public double getTaxaComissao(){
        taxaComissao = taxaComissao / 100;
        return taxaComissao;
    }
    
    public void addPedido(Pedido p){
        pedidos.add(p); //método pode ser executado inúmeras vezes de forma indeterminada
    }
}