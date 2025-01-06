/**
 *
 * @author Dimas
 */
public class Aplic {
    public static void main(String[] args) {
        Circulo objCirc1 = new Circulo();
        
        //passagem mensagens
        objCirc1.setRaio(1.0);
        
        System.out.println("\n\nMedida do raio: " + objCirc1.getRaio());     
        System.out.println("Medida da área: " + objCirc1.calcArea());
        System.out.println("Medida do perímetro: " + objCirc1.calcPerimetro());
        System.out.println("Medida do diâmetro: " + objCirc1.calcDiametro());
        
        Circulo objCirc2 = new Circulo();
        
        //passagem mensagens
        objCirc2.setRaio(2.5);
        
        System.out.println("\n\nMedida do raio: " + objCirc2.getRaio());     
        System.out.println("Medida da área: " + objCirc2.calcArea());
        System.out.println("Medida do perímetro: " + objCirc2.calcPerimetro());
        System.out.println("Medida do diâmetro: " + objCirc2.calcDiametro());
    }    
}
