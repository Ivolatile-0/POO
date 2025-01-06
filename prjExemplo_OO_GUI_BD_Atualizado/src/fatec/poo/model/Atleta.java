package fatec.poo.model;

/**
 *
 * @author Juan e Vinícius
 */
public class Atleta {
    
    private String cpf;
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Atleta(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double calcIMC ()
    {
        return peso/(altura * altura);
    }
    
}
