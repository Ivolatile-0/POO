/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author Ingrid
 */
public class Aplic {
        double saldo;
        int numero, opcao;
        Scanner opcao = new Scanner(System.in);
        
        //criação do ponteiro,
        //instanciação(alocação) de um objeto da classe Retangulo
        //e chamada do método construtor
       
        ContaCorrente objConta = new ContaCorrente();
        
        System.out.print("Digite a medida da altura: ");
        medAlt = entrada.nextDouble();
        System.out.print("Digite a medida da base: ");
        medBase = entrada.nextDouble();
        
        //Utilizando a passagem de mensagens
        objRet.setAltura(medAlt);
        objRet.setBase(medBase);
        
        do{
             System.out.println("\n1 - Consultar Área");
             System.out.println("2 - Consultar Perímetro");
             System.out.println("3 - Consultar Diagonal");
             System.out.println("4 - Sair");
             System.out.print("\n\tDigite a opcao: ");
             opcao = entrada.nextInt();             
             
             switch(opcao){ //passagem de mensagens
                 case 1 : System.out.println("\n\nMedida da Altura: " + objRet.getAltura());
                          System.out.println("Medida da Base: " + objRet.getBase());
                          System.out.println("A medida da área: " + objRet.calcArea());
                          break;
                 case 2 : System.out.println("\n\nMedida da Altura: " + objRet.getAltura());
                          System.out.println("Medida da Base: " + objRet.getBase());
                          System.out.println("A medida do perímetro: " + objRet.calcPerimetro());
                          break;
                 case 3 : System.out.println("\n\nMedida da Altura: " + objRet.getAltura());
                          System.out.println("Medida da Base: " + objRet.getBase());
                          System.out.println("A medida da diagonal: " + objRet.calcDiagonal());
             }
        }while (opcao < 4);
    }    
}
}
