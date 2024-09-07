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

    public double calcDelta(){
        double delta;
        delta = (coef_B * coef_B) - (4 * coef_A * coef_C);
        return delta;
    }
    
    public double calcRaiz(int identificacaoRaiz){
        double raiz1, raiz2;
        double delta = calcDelta();
        
        if(delta >= 0){
            if(identificacaoRaiz == 1){
                return raiz1 = ((-coef_B + Math.sqrt(delta))/(2*coef_A));
            }else
                if (identificacaoRaiz == 2){
                    return raiz2 = ((-coef_B - Math.sqrt(delta))/(2*coef_A));
                }                        
        }
        return 0.0;
    }
    
    public String exibeEquacao(){
        
        return "Equação: " + coef_A + "X² + " + coef_B + "X + " + coef_C;
    }
}
