package fatec.poo.model;

/**
 *
 * @author Ingrid
 */
public class Departamento {
    private String sigla;
    private String nome;
    private Funcionario[] funcionarios; //definindo a matriz de objetos -> agrupamento de ponteiros
                                                                  //representação da multiplicidade
    private int numFunc;
    
    //Criar construtor de forma automática -> inserir código
    public Departamento(String sigla, String nome) {
        //diferencia o parâmetro de um atributo -> mesmo tendo o mesmo nome, não vai dar erro
        this.sigla = sigla;
        this.nome = nome;
        funcionarios = new Funcionario[5]; //criando a matriz com 5 elementos no construtor  
                                                                        //boa pra ser construida no construtor pq esse método será instanciada uma única vez no início da aplicação
        numFunc = 0; //indica a posição do primeiro elemento da matriz
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
    //tem como parâmetro de entrada o endereço de um objeto da subclasse Funcionario
    //Horista, mensalista ou comissionado
    public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f; //o elemento da matriz funcionarios ira pegar a posição de numFunc e irá colocar no ponteiro f
        numFunc++; //incremento de numFunc para ir para a próxima posição da matriz
    }
    
    public void listarFuncionarios(){
        System.out.println("\n\nSigla: " + sigla);
        System.out.println("\n\nNome: " + nome);
        System.out.println("\n\nQtde de Funcionários: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for (int x = 0; x < numFunc; x++) {
            System.out.print(funcionarios[x].getRegistro() + "\t\t");
            System.out.print(funcionarios[x].getNome() + "\t\t");
            System.out.println(funcionarios[x].getCargo());
     }
    }
}
