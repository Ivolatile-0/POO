
import java.util.Scanner;

/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Retangulo objRet = new Retangulo();
        
        double medAlt, medBase;
        
        System.out.println("Digite a medida da altura: ");
        medAlt = entrada.nextDouble(); //scanf("%lf", &medAlt);
        System.out.println("Digite a medida da base: ");
        medBase = entrada.nextDouble(); //scanf("%lf", &medBase);
        
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        System.out.println("Medida da altura: " + objRet.getAltura());
        System.out.println("Medida da base: " + objRet.getBase());
        System.out.println("Medida da área: " + objRet.calcArea());
        System.out.println("Medida do perímetro: " + objRet.calcPerimetro());
        System.out.println("Medida da diagonal: " + objRet.calcDiagona());
    }
    
}
