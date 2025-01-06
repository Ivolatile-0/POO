package fatec.poo.model;

/**
 *
 * @author Ingrid
 */
public class Cliente extends Pessoa{
    private double limiteCredito;
    private double limiteDisponivel;

    public Cliente (String cpf, String nome, double limiteCredito) {
        super(nome, cpf);
        this.limiteCredito = limiteCredito;
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
    
}
