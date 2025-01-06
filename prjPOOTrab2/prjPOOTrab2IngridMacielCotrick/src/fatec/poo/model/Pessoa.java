package fatec.poo.model;

/**
 *
 * @author Ingrid
 */
public class Pessoa {
    private int codigo;
    private String nome;
    
    public Pessoa(int c, String n){
        codigo = c;
        nome = n;
    }

    public int getCodigo(){
        return codigo;
    }
    
    public String getNome(){
        return nome;
    }
     
    
}
