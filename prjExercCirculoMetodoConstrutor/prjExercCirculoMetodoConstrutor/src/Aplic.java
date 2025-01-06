
import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author Dimass
 */
public class Aplic {
    public static void main(String[] args) {       
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);        
        double medRaio;
        int opcao;
        String unidade;
        
        //Montar o Retangulo
        System.out.print("Digite a medida unidade de medida: ");
        unidade = entrada.next(); //scanf("%s", &unidade)
        Circulo objCirc = new Circulo(unidade);
        
        System.out.print("Digite a medida do raio do circulo: ");
        medRaio = entrada.nextDouble();
        
        objCirc.setRaio(medRaio); //passagem de mensagens
        
        do{
            System.out.println("\n\n1-Consultar área do circulo");
            System.out.println("2-Consultar perímetro do circulo");
            System.out.println("3-Consultar diâmetro do retângulo");
            System.out.println("4-Sair");
            System.out.print("\n\tDigite a opção: ");            
            opcao = entrada.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("\nMedida do raio do circulo: " + df.format(objCirc.getRaio()) + " " + objCirc.getUnidadeMedida());                
                    System.out.println("Medida da área: " + df.format(objCirc.calcArea()) + " " + objCirc.getUnidadeMedida() + "²");
                    break;
                
                case 2:               
                   System.out.println("\nMedida do raio do circulo: " + df.format(objCirc.getRaio()) + " " + objCirc.getUnidadeMedida());               
                   System.out.println("Medida do perímetro: " + df.format(objCirc.calcPerimetro()) + " " + objCirc.getUnidadeMedida());
                   break;
                   
                case 3:
                      System.out.println("\nMedida do raio do circulo: " + df.format(objCirc.getRaio()) + " " + objCirc.getUnidadeMedida());  
                      System.out.println("Medida do diâmetro: " + df.format(objCirc.calcDiametro()) + " " + objCirc.getUnidadeMedida());            
            }
        }while(opcao < 4);
    }    
}
