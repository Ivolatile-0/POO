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
        double delta; //Varieal que vai receber o valor de Delta.
        delta = (coef_B * coef_B) - (4 * coef_A * coef_C); //Formula de Delta.
        return delta; //A função imprimirá o valor de Delta quando for chamado.
    }
    
    public double calcRaiz(int identificacaoRaiz){
        double raiz1, raiz2; //Variaveis para receber cada valor de da raiz.
        double delta = calcDelta(); //Nova variavel de Delta que receberá o valor de Delta
                                  //calculado na função calcDelta().
        
        if(delta >= 0){ //Sempre que Delta for maior que zero ele terá uma ou mais raiz.
            if(identificacaoRaiz == 1){ //A variavel identificadorRaiz de 
                                      //quando for chamado mostrará a raiz 1 ou raiz 2.
                return raiz1 = ((-coef_B + Math.sqrt(delta))/(2*coef_A));
            }else
                if (identificacaoRaiz == 2){
                    return raiz2 = ((-coef_B - Math.sqrt(delta))/(2*coef_A));
                }                        
        }
        return 0.0; //Uma função que não é void sempre precisará retornar 
                    //algo antes da ultima chave, mas como não montei uma lógica
                    //que imprimisse no final, coloquei zero para o sistema não apontar erro.
    }
    
    public String exibeEquacao(){
        //Exibe uma String, porém este resultado deve ser colocado em uma variável quando for chamado. 
        return "Equação: " + coef_A + "X² + " + coef_B + "X + " + coef_C;
    }
}
