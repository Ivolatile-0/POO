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
    
        Equacao2Grau objEquacao = new Equacao2Grau(A,B,C);
        
        equacao = objEquacao.exibeEquacao();
        System.out.println(equacao);
        
        delta = objEquacao.calcDelta();
        if(delta > 0){
            System.out.println("Raiz: " + objEquacao.calcRaiz(1));
            System.out.println("Raiz: " + objEquacao.calcRaiz(2));
        }else
            if (delta == 0){
                System.out.println("Raiz: " + objEquacao.calcRaiz(1));
            }else{
                System.out.println("Não tem raiz real");
            }
    }  
}
