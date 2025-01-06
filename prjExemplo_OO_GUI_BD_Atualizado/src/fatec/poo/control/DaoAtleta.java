package fatec.poo.control;

import fatec.poo.model.Aluno;
import fatec.poo.model.Atleta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Dimas
 */
public class DaoAtleta {
    private Connection conn;
    
    public DaoAtleta(Connection conn) {
         this.conn = conn;
    }    
    
    public Atleta consultar (String cpf) {
        Atleta objAtleta = null;         
       
        PreparedStatement ps;
        
        try{
              ps = conn.prepareStatement("Select * from tblAtleta where CPF = ?");
              ps.setString(1, cpf);
              ResultSet rs = ps.executeQuery();
              if (rs.next() == true){//localizou a linha na tabela
                  objAtleta = new Atleta(rs.getString("cpf"),
                                         rs.getString("Nome"));
                  //////////////////////////////////////////////////////
                  objAtleta.setIdade(rs.getInt("Idade"));
                  objAtleta.setAltura(rs.getDouble("Altura"));
                  objAtleta.setPeso(rs.getDouble("Peso"));                  
              }              
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
        return(objAtleta);
    }    
     
    public void inserir(Atleta objAtleta){
        PreparedStatement ps = null;
        try{
            ps = conn.prepareStatement("Insert into tblAtleta values (?,?,?,?,?)");
            ps.setString(1, objAtleta.getCpf());
            ps.setString(2, objAtleta.getNome());
            ps.setInt(3, objAtleta.getIdade());
            ps.setDouble(4, objAtleta.getAltura());
            ps.setDouble(5, objAtleta.getPeso());
            ps.execute();
        }catch(SQLException ex){
            System.out.println(ex.toString());
        }
    }  
    
    public void alterar(Atleta objAtleta) {
        PreparedStatement ps = null;
            try {
                ps = conn.prepareStatement("UPDATE tblAtleta set Nome = ?, Idade = ?, Altura = ?, Peso = ? where CPF = ?");           
                ps.setString(1, objAtleta.getNome());
                ps.setInt(2, objAtleta.getIdade());
	        ps.setDouble(3, objAtleta.getAltura());
                ps.setDouble(4, objAtleta.getPeso());
                ps.setString(5, objAtleta.getCpf());
                ps.execute();
            } catch (SQLException ex) {
                System.out.println(ex.toString());   
            }        
    }
    
    public void excluir(Atleta objAtleta) {
        PreparedStatement ps = null;
            try {
                ps = conn.prepareStatement("Delete from tblAtleta where CPF = ?");
                ps.setString(1, objAtleta.getCpf());
                      
                ps.execute();
            } catch (SQLException ex) {
                System.out.println(ex.toString());   
            }
    }
}
