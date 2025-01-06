package fatec.poo.model;

public class Projeto {
    private int codigo;
    private String descricao;
    private String dtInicio;
    private String dtTermino;
    private Funcionario[] funcionarios; 
    private int numFunc;
    
    public Projeto (int codigo, String descricao){
        this.codigo = codigo;
        this.descricao = descricao;
        funcionarios = new Funcionario[5];
    }
    public void setDtInicio(String dtIn){
      dtInicio = dtIn;
     }
    public void setDtTermino(String dtTe){
      dtTermino = dtTe;
     }
      public void addFuncionario(Funcionario f){
        funcionarios[numFunc] = f; //o elemento da matriz funcionarios ira pegar a posição de numFunc e irá colocar no ponteiro f
        numFunc++; //incremento de numFunc para ir para a próxima posição da matriz
     }
      public int getCodigo(){
          return codigo;
      }
      public String getDescricao(){
          return descricao;
      }
      public String getDtInicio(){
          return dtInicio;
      }
      public String getDtTermino(){
          return dtTermino;
      }
      
      public void listarFuncionarios(){
        System.out.println("\n\nCódigo: " + codigo);
        System.out.println("\n\nDescricao: " + descricao);
        System.out.println("\n\nData Início: " + dtInicio);
        System.out.println("\n\nData Término: " + dtTermino);
        System.out.println("\n\nQtde de Funcionários: " + numFunc);
        System.out.println("\nRegistro\t\tNome\t\tCargo");
        for (int x = 0; x < numFunc; x++) {
            System.out.print(funcionarios[x].getRegistro() + "\t\t");
            System.out.print(funcionarios[x].getNome() + "\t\t");
            System.out.println(funcionarios[x].getCargo() + "\t\t");
            System.out.println(funcionarios[x].getDepartamento()); }
        }
}


