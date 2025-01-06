package fatec.poo.model;

/**
 *
 * @author Ingrid
 */
public class Pedido {
    private String numero;
    private String dataEmissao;
    private double valor;
    private Cliente cliente;
    private Vendedor vendedor;
    
    public Pedido(String numero){
        this.numero = numero;
    }
    
    public void setDataEmissao(String dataEmissao){
        this.dataEmissao = dataEmissao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNumero() {
        return numero;
    }
    
    public String getDataEmissao() {
        return dataEmissao;
    }

    public double getValor() {
        return valor;
    }
    
    //retorna endereco do cliente
    public Cliente cliente() {
        return cliente;
    }

    //Tem como parâmetro de entrada o endereço de um
    //objeto do cliente
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    //retorna endereco do vendedor
    public Vendedor vendedor() {
        return vendedor;
    }

    //Tem como parâmetro de entrada o endereço de um
    //objeto do cliente
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
}
