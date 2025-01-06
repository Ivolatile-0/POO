/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Ingrid
 */
public class AplicCirculo {
     public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner entrada = new Scanner(System.in);
        double Raio;
        int opcao;
        String unidade;
        
        
        System.out.println("Digite a unidade de medida: ");
        unidade = entrada.next(); //variável do tipo string -> sempre vai ser .next
        
        //criação do ponteiro,
        //instanciação(alocação) de um objeto da classe Retangulo
        //e chamada do método construtor
       
        Circulo objCirc1 = new Circulo();
        System.out.print("Digite a medida do raio: ");
        Raio = entrada.nextDouble();
        
        System.out.println("Digite a opção desejada");
        System.out.println("1 - Consultar a medida da área do círculo");
        System.out.println("2 - Consultar a medida do perímetro do círculo");
        System.out.println("3 - Consultar a medida do diâmetro do círculo");
        System.out.println("4 - Sair");
        
        
        //passagem mensagens
        objCirc1.setRaio(1.0);
        
        System.out.println("\n\nMedida do raio: " + df.format(objCirc1.getRaio()) + " ");     
        System.out.println("Medida da área: " + df.format(objCirc1.calcArea()));
        System.out.println("Medida do perímetro: " + df.format(objCirc1.calcPerimetro()));
        System.out.println("Medida do diâmetro: " + df.format(objCirc1.calcDiametro()));
        
        
        Circulo objCirc2 = new Circulo();
        
        //passagem mensagens
        objCirc2.setRaio(2.5);
        
        System.out.println("\n\nMedida do raio: " + objCirc2.getRaio());     
        System.out.println("Medida da área: " + objCirc2.calcArea());
        System.out.println("Medida do perímetro: " + objCirc2.calcPerimetro());
        System.out.println("Medida do diâmetro: " + objCirc2.calcDiametro());
    } 
}
