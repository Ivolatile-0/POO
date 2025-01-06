package fatec.poo.model;
import java.util.ArrayList;

/**
 *
 * @author Dimas
 */
public class Departamento {
    private String sigla;
    private String nome;
    private ArrayList<Funcionario> funcionarios; //Multiplicidade 1...*
    
    public Departamento(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new ArrayList<Funcionario>(); //Método construtor para agrupar o ArrayList
    }

    public String getSigla() { 
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    
    public void addFuncionario(Funcionario f){
        funcionarios.add(f); //método pode ser executado inúmeras vezes de forma indeterminada
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("Nome: " + nome);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for (int x = 0; x < funcionarios.size(); x++){ //O número de objetos é determinado pelo método size do ArrayList
            System.out.print(funcionarios.get(x).getRegistro() + "\t\t"); //Acessar o objeto através do get do elemento e através dele, acessar o getRegistro.
            System.out.print(funcionarios.get(x).getNome() + "\t\t");
            System.out.println(funcionarios.get(x).getCargo());
        }
    }
}
