package DTO;

/**
 *
 * @author Felipe
 */
public class pecaDTO {
    
    private String nome_peca;
    private String codigo;
    private String descricao;
    private String preco;
    private String quantidade;
    private String peca;
    private String quantidadeexcluir;
    private int id_peca;

    public String getNome_peca() {
        return nome_peca;
    }

    public void setNome_peca(String nome_peca) {
        this.nome_peca = nome_peca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPeca() {
        return peca;
    }

    public void setPeca(String peca) {
        this.peca = peca;
    }

    public String getQuantidadeexcluir() {
        return quantidadeexcluir;
    }

    public void setQuantidadeexcluir(String quantidadeexcluir) {
        this.quantidadeexcluir = quantidadeexcluir;
    }  

    public int getId_peca() {
        return id_peca;
    }

    public void setId_peca(int id_peca) {
        this.id_peca = id_peca;
    }

    public void AlterarEstoque(pecaDTO objpeca) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'AlterarEstoque'");
    }
    
}
