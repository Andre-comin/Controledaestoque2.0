public class PedidoCompra {
    private String numeroPedido;
    private String data;
    private String fornecedor;
    private String peca;
    private int quantidade;
    private boolean concluido;

    public PedidoCompra(String numeroPedido, String data, String fornecedor, String peca, int quantidade) {
        this.numeroPedido = numeroPedido;
        this.data = data;
        this.fornecedor = fornecedor;
        this.peca = peca;
        this.quantidade = quantidade;
        this.concluido = false;
    }

    public String getNumeroPedido() { return numeroPedido; }
    public String getData() { return data; }
    public String getFornecedor() { return fornecedor; }
    public String getPeca() { return peca; }
    public int getQuantidade() { return quantidade; }
    public boolean isConcluido() { return concluido; }

    public void setConcluido(boolean concluido) { this.concluido = concluido; }
}
