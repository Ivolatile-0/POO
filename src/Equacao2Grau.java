/**
 *
 * @author Ingrid
 */
public class Equacao2Grau {
    private double coef_A;
    private double coef_B;
    private double coef_C;
    
    public Equacao2Grau (double a, double b, double c){
        coef_A = a; 
        coef_B = b; 
        coef_C = c;   
    }

    Equacao2Grau(String equacao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getCalcDelta(){
        double delta;
        delta = Math.pow(b, 2);
        return delta;
    }
    
    public double getCalcRaiz(int resultado){
        double delta, a, b, c;
        int raiz0, raiz1, raiz2;
        
        delta = calcDelta();
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            if (delta = 0){
                int raiz0 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
                return raiz0;
            }else{
                int raiz1 = (int) ((-b + Math.sqrt(delta)) / (2 * a));
                int raiz2 = (int) ((-b - Math.sqrt(delta)) / (2 * a));
                return raiz1, raiz2;
            }
        }    
    }
    
    public String setExibeEquacao(){
        String equacao
       equacao = eq;
    }
}
