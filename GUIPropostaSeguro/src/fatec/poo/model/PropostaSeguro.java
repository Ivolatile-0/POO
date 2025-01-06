
package fatec.poo.model;

public class PropostaSeguro {
                         private String nome;
                       private double valorCarro;
                      private double valorBase;
                      private boolean sexo;
                      private int faixaIdade;
                      private boolean perfilMotorista;
                      private boolean perfilCidade;

    public PropostaSeguro(String nome, double valorCarro) {
        this.nome = nome;
        this.valorCarro = valorCarro;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setFaixaIdade(int faixaIdade) {
        this.faixaIdade = faixaIdade;
    }

    public void setPerfilMotorista(boolean perfilMotorista) {
        this.perfilMotorista = perfilMotorista;
    }

    public void setPerfilCidade(boolean perfilCidade) {
        this.perfilCidade = perfilCidade;
    }

    public double calcDescSexo (){
        if (sexo = false) {
            valorBase = valorCarro / 7.5;
            return valorBase;
        } else{
            return valorCarro;
        }
    }                      
       public double calcDescIdade(){
           switch
                  () case 0: 
                       valorBase = valorCarro / 2.5;
              
       }               
        
}
