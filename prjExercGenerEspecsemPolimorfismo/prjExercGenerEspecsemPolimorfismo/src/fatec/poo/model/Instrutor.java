package fatec.poo.model;

/**
 *
 * @author Dimas
 */
public class Instrutor extends Pessoa{
    private int identificacao;
    private String areaAtuacao;

    public Instrutor(int id, String n, String t) {
        super(n, t);//chamada do método construtor
                    //da superclasse Pessoa
        identificacao = id;
    }

    public void setAreaAtuacao(String at) {
        areaAtuacao = at;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
}
