import java.util.Scanner;
import java.text.DecimalFormat;

/*** @author Ingrid */

public class Aplic {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        double A, B, C;
        double delta;
        String equacao; 
        
        System.out.println("Digite o coeficiente de a:");
        A = entrada.nextDouble();
        System.out.println("Digite o coeficiente de b:");
        B = entrada.nextDouble();
        System.out.println("Digite o coeficiente de c:");
        C = entrada.nextDouble();
    
        //No contrutor é necessário identificar parametros (variaveis) do mesmo tipo definido na classe
        //Ver linha 10 do arquivo Equacao2Grau.
        Equacao2Grau objEquacao = new Equacao2Grau(A,B,C);
         
        equacao = objEquacao.exibeEquacao(); //Variavel receberá o valor definida na função exibeEquacao() 
        System.out.println(equacao); //Imprime a variável
        
        delta = objEquacao.calcDelta(); //delta receberá o valor da função calcDelta()
        if(delta > 0){
            System.out.println("Raiz: " + objEquacao.calcRaiz(1)); //Imprimindo o valor de retorno definido se identificador for 1
            System.out.println("Raiz: " + objEquacao.calcRaiz(2));//Imprimindo o valor de retorno definido se identificador for 2
        }else
            if (delta == 0){
                System.out.println("Raiz: " + objEquacao.calcRaiz(1));
            }else{
                System.out.println("Não tem raiz real");
            }
    }  
}
