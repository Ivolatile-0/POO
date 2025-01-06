package fatec.poo.model;

/**
 *
 * @author Ingrid
 */
public class Vendedor extends Pessoa{
    private double SalarioBase;
    private double taxaComissao;

    public Vendedor(String cpf, String nome, double SalarioBase) {
        super(nome, cpf);
        this.SalarioBase = SalarioBase;
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
}
