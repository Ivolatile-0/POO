import java.util.Scanner;
import src.Livro;



/**
 *
 * @author Ingrid
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite a identificação do livro");
    int identificacao = entrada.nextInt();
    System.out.println("Digite o título do livro");
    String titulo = entrada.next();
    boolean situacao = false;
    System.out.println("Digite o valor da multa diária");
    double valMultaDiaria = entrada.nextDouble();
    int opcao = 0;
    
    Livro objLivro = new Livro(identificacao,titulo);
    
    while (opcao < 4) {
        System.out.println("Digite a opção desejada");
        System.out.println("1 - Consultar livro");
        System.out.println("2 - Emprestar livro");
        System.out.println("3 - Devolver livro");
        System.out.println("4 - Sair");
        opcao = entrada.nextInt();
                     
             
        switch(opcao){ //passagem de mensagens
                 case 1 : System.out.println("\n\nIdentificação do Livro: " + objLivro.getIdentificacao());
                          System.out.println("Título do Livro: " + objLivro.getTitulo());
                          System.out.println("Situação do Livro: " + objLivro.isSituacao());
                          break;
                 case 2 : //System.out.println("\n\nSituação do Livro: " + objLivro.isSituacao());
                          if (objLivro.isSituacao() == true){
                                System.out.println("O livro está emprestado");
                          }
                          else{
                              objLivro.emprestar();
                              System.out.println("Livro emprestado " + objLivro.isSituacao());
                          }
                          break;
                 case 3 : //System.out.println("\n\nSituação do Livro: " + objLivro.isSituacao());
                          if (objLivro.isSituacao() == false){
                                System.out.println("O livro já está disponível");
                          }
                          else{
                              System.out.println("Quantos dias está atrasado a devolução do livro?");
                              int diasAtraso = entrada.nextInt();
                              System.out.println("O valor a ser pago pelo atraso: " + objLivro.devolver(diasAtraso));
                          }
                          break;
             }
        }
    }
}
