package fatec.poo.model;

/**
 *
 * @author Dimas
 */
abstract public class Funcionario {
    private int registro;
    private String nome;
    private String dtAdmissao;  
    private String cargo;
    private Departamento departamento;  //representação da multiplicidade 1
    //começa com valor null -> colocar valor e acessar (get e set)
    private Projeto projeto;
    
    //pode ser usado no método construtor -> adicionar o ponteiro
    public Funcionario(int r, String n, String dtAdm){
        registro = r;
        nome = n;
        dtAdmissao = dtAdm;  
    }   
    
    public int getRegistro(){
        return(registro);
    }
    public String getNome(){
        return(nome);
    }
    public String getDtAdmissao(){
        return(dtAdmissao);
    }
    public String getCargo(){
        return(cargo);
    }
    public void setCargo(String c){
        cargo = c;
    }

    //retorna o endereço de um objeto da classe Departamento
    public Departamento getDepartamento() {
        return departamento;
    }
    
    //tem como parâmetro de entrada o endereço de um objeto da classe Departamento
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
    
    public Projeto getProjeto(){
        return projeto;
    }
    
    public void setProjeto(Projeto projeto){
    this.projeto = projeto;
    }
    
    public abstract double calcSalBruto();
    
    public double calcDesconto(){
        return(0.10 * calcSalBruto());
    }
    public double calcSalLiquido(){
        return(calcSalBruto() - calcDesconto());
    }
}
