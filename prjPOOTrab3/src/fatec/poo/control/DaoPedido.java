package fatec.poo.control;

import fatec.poo.model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoPedido {
    private Connection conn;
    
    public DaoPedido(Connection conn) {
         this.conn = conn;
    }
    
    public Pedido consultarPedido(String numero) {
        Pedido objPed = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblPedido where Num_Ped = ?");
            
            ps.setString(1, numero);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                objPed = new Pedido(rs.getString("Num_Ped"));
                objPed.setDataEmissao(rs.getString("DataEmi_Ped"));
                objPed.setValor(rs.getDouble("Valor_Ped"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(objPed);
    } 
    
    public Pedido consultarCliente (String cpf) {
        Pedido objPed = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblCliente where CPF_Cli = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                objPed = new Pedido(rs.getString("Num_Ped"));
                objPed.setDataEmissao(rs.getString("DataEmi_Ped"));
                objPed.setValor(rs.getDouble("Valor_Ped"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(objPed);
    } 
    
    public Pedido consultarVendedor (String cpf) {
        Pedido objPed = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblVendedor where CPF_Vend = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                objPed = new Pedido(rs.getString("Num_Ped"));
                objPed.setDataEmissao(rs.getString("DataEmi_Ped"));
                objPed.setValor(rs.getDouble("Valor_Ped"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(objPed);
    } 
    
    public void inserir(Pedido objPed) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("Insert into tblPedido values(?,?,?)");
            ps.setString(1, objPed.getNumero());
            ps.setString(2, objPed.getDataEmissao());
            ps.setDouble(3, objPed.getValor());          
                      
            ps.execute(); //envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void alterar(Pedido objPed) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblPedido set Num_Ped = ?, " +
                                       "DataEmi_Ped = ?, " +
                                       "Valor_Ped = ? ");
            
            ps.setString(1, objPed.getNumero());
            ps.setString(2, objPed.getDataEmissao());
            ps.setDouble(3, objPed.getValor());
           
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Pedido objPed) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblPedido where Num_Ped = ?");
            
            ps.setString(1, objPed.getNumero());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
}