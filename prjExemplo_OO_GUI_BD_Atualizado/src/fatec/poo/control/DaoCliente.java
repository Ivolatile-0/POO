package fatec.poo.control;

import fatec.poo.model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dimas
 */
public class DaoCliente {
    private Connection conn;
    
    public DaoCliente(Connection conn) {
         this.conn = conn;
    }    
    
    public Cliente consultar (String cpf) {
        Cliente objCli = null;         
       
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblCliente where CPF_Cli = ?");
            
            ps.setString(1, cpf);
            ResultSet rs = ps.executeQuery();
           
            if (rs.next()) {
                objCli = new Cliente(rs.getString("CPF_Cli"),
                                     rs.getString("Nome_Cli"),
                                     rs.getDouble("LimCred_Cli"));  
                objCli.setLimCredDisp(rs.getDouble("LimCredDisp_Cli"));
            }
        }
        catch (SQLException ex) { 
             System.out.println(ex.toString());   
        }
        return(objCli);
    }    
     
    public void inserir(Cliente objCli) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("Insert into tblCliente values(?,?,?,?)");
            ps.setString(1, objCli.getCpf());
            ps.setString(2, objCli.getNome());
            ps.setDouble(3, objCli.getLimCred());
            ps.setDouble(4, objCli.getLimCredDisp());           
                      
            ps.execute(); //envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }  
    
    public void alterar(Cliente objCli) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblCliente set Nome_Cli = ?, " +
                                       "LimCred_Cli = ?, " +
                                       "LimCredDisp_Cli = ? " +
                                       "where CPF_Cli = ?");
            
            ps.setString(1, objCli.getNome());
            ps.setDouble(2, objCli.getLimCred());
            ps.setDouble(3, objCli.getLimCredDisp());
            ps.setString(4, objCli.getCpf());
           
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
    
    public void excluir(Cliente objCli) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE FROM tblCliente where CPF_Cli = ?");
            
            ps.setString(1, objCli.getCpf());
                      
            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
             System.out.println(ex.toString());   
        }
    }
}
