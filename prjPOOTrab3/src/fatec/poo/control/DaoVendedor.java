package fatec.poo.control;

import fatec.poo.model.Vendedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaoVendedor {
    private Connection conn;
    
    public DaoVendedor(Connection conn) {
         this.conn = conn;
    }
     public Vendedor consultar (String cpf) {
        Vendedor objVend = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblVendedor where CPF_Vend = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                objVend = new Vendedor(rs.getString("CPF_Vend"),
                                     rs.getString("Nome_Vend"),
                                     rs.getDouble("SalBase_Vend"));  
                objVend.setTaxaComissao(rs.getDouble("TaxaCom_Vend"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(objVend);
    } 
     
    public void inserir(Vendedor objVend) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("Insert into tblVendedor values(?,?,?,?)");
            ps.setString(1, objVend.getCpf());
            ps.setString(2, objVend.getNome());
            ps.setDouble(3, objVend.getSalarioBase());
            ps.setDouble(4, objVend.getTaxaComissao());           
                      
            ps.execute(); //envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    } 
    
    public void alterar(Vendedor objVend) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblVendedor set Nome_Vend = ?, " +
                                       "SalBase_Vend = ?, " +
                                       "TaxaCom_Vend =?" +
                                       "where CPF_Vend = ?");
            
            ps.setString(1, objVend.getNome());
            ps.setDouble(2, objVend.getSalarioBase());
            ps.setDouble(3, objVend.getTaxaComissao());
            ps.setString(4, objVend.getCpf());
           
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Vendedor objVend) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblVendedor where CPF_Vend = ?");
            
            ps.setString(1, objVend.getCpf());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
