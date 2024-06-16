/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.pecaDTO;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author andri
 */
public class PecaDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<pecaDTO> lista = new ArrayList<>();
    
    public void cadastrarpeca(pecaDTO objpecadto){
        
        String sql = "insert  into peca (Codigo, Nome, Descricao, Preco, QuantidadeEstoque ) values (?,?,?,?,?)";
        
        conn = new ConexaoDAO().getConexao();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objpecadto.getCodigo());
            pstm.setString(2, objpecadto.getNome_peca());
            pstm.setString(3, objpecadto.getDescricao());
            pstm.setString(4, objpecadto.getPreco());
            pstm.setString(5, objpecadto.getQuantidade());
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "PecaDAo" + erro);
        }
    }
    
    public ArrayList<pecaDTO> PesquisarPeca(){
        String sql = "Select * from peca";
        conn = new ConexaoDAO().getConexao();
        
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                pecaDTO objpecadto = new pecaDTO();
                objpecadto.setId_peca(rs.getInt("ID_Peca"));
                objpecadto.setCodigo(rs.getString("Codigo"));
                objpecadto.setNome_peca(rs.getString("Nome"));
                objpecadto.setDescricao(rs.getString("Descricao"));
                objpecadto.setPreco(rs.getString("Preco"));
                objpecadto.setQuantidade(rs.getString("QuantidadeEstoque"));  
                
                lista.add(objpecadto);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "PecaDAo Pesquisar" + erro);
        }
        
        return lista;
    }

    public void alterarpeca(pecaDTO objpecaDTO){
        String sql = " update tabela peca set QuantidadeEstoque = ?, Nome = ? where ID_Peca ";
        conn = new ConexaoDAO().getConexao();
        
        try {
            
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objpecaDTO.getQuantidade());
            pstm.setString(2, objpecaDTO.getPeca());
            pstm.setInt(3, objpecaDTO.getId_peca());

            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            
            JOptionPane.showMessageDialog(null, "PecaDAo alterar" + erro);
        }

    } 
    
}
