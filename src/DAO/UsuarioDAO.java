package DAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import DTO.UsuarioDTO;

public class UsuarioDAO {

    Connection conn;

    public  ResultSet autenticacaoUsuario(UsuarioDTO objuUsuarioDTO){

        conn = new ConexaoDAO().getConexao();

           try {

            String sql = "Select * from usuario where nome_usuario = ? and senha_usuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);    
            pstm.setString(1, objuUsuarioDTO.getNome_usuario());
            pstm.setString(2, objuUsuarioDTO.getSenha_usuario());
            ResultSet rs = pstm.executeQuery();
            return rs;
           } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "Conexao: " + erro);
            return null;
            
           }
          
        
    }
    
    
}
