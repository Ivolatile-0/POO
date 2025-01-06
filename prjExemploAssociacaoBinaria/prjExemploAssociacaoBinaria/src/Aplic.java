import fatec.poo.model.Departamento;
import fatec.poo.model.FuncionarioComissionado;
import fatec.poo.model.FuncionarioHorista;
import fatec.poo.model.FuncionarioMensalista;
import fatec.poo.model.Projeto;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        //identificador ponteiro
        FuncionarioHorista funcHor = new FuncionarioHorista(1010,
                                                            "Pedro Silveira",
                                                            "14/05/1978",
                                                            15.80);
        FuncionarioMensalista funcMen = new FuncionarioMensalista(2020,
                                                                  "Ana Beatriz", 
                                                                  "22/10/1997",
                                                                  600.0);
        
        FuncionarioComissionado funcCom = new FuncionarioComissionado(3030, 
                                                                      "Joao Mendes",
                                                                      "10/12/1975",
                                                                      10);
        
        Departamento dep1 = new Departamento("CP", "Compras");
        Departamento dep2 = new Departamento("VD", "Vendas");
        Projeto prj1 = new Projeto(0123, "Gestão de Recursos");
        Projeto prj2 = new Projeto(4567, "Novo Produto");
        
        funcHor.setCargo("Programador");
        funcMen.setCargo("Aux.Administrativo");
        funcCom.setCargo("Vendedor");
     
        //Estabelece a associação entre um objeto da classse FuncionárioHorista
        //com um objeto da classe Departamento
        funcHor.setDepartamento(dep1);
        System.out.println("O funcionário horista " + funcHor.getNome()  + 
                " trabalha no departamento de " + funcHor.getDepartamento().getNome()); //getNome -> retorna uma mensagem 
                                                                                                                                                    //dps de acessar o endereço de Departamento
    
        //Estabelece a associação entre um objeto da classse FuncionárioMensalista
        //com um objeto da classe Departamento
        funcMen.setDepartamento(dep1);
        System.out.println("O funcionário mensalista: " + funcMen.getNome() + 
                " trabalha no departamento de " + funcHor.getDepartamento().getNome());
        
        //Estabelece a associação entre um objeto da classse FuncionárioComissionado
        //com um objeto da classe Departamento
        funcCom.setDepartamento(dep2);
        System.out.println("O funcionário comissionado: " + funcCom.getNome() +
                " trabalha no departamento de " + funcCom.getDepartamento().getNome());
        
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto das classes FuncionarioHorista e FuncionarioMensalista
        dep1.addFuncionario(funcHor);
        dep1.addFuncionario(funcMen);
        dep1.listarFuncionarios();
        
        //Estabelece a associação entre um objeto da classe Departamento com
        //um objeto da classe FuncionarioComissionado
        dep2.addFuncionario(funcCom);
        dep2.listarFuncionarios();
        
        //Fazer a associação de funcionários com a classe Projeto
        prj1.addFuncionario(funcHor);
        prj1.addFuncionario(funcCom);
        prj1.listarFuncionarios();
        
        prj2.addFuncionario(funcMen);
    }    
}
