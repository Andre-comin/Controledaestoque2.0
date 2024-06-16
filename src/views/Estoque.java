import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<PedidoCompra> pedidos;

    public Estoque() {
        pedidos = new ArrayList<>();
    }

    public void adicionarPedido(PedidoCompra pedido) {
        pedidos.add(pedido);
    }

    public List<PedidoCompra> getPedidosEmAberto() {
        List<PedidoCompra> emAberto = new ArrayList<>();
        for (PedidoCompra pedido : pedidos) {
            if (!pedido.isConcluido()) {
                emAberto.add(pedido);
            }
        }
        return emAberto;
    }

    public List<PedidoCompra> getPedidosConcluidos() {
        List<PedidoCompra> concluidos = new ArrayList<>();
        for (PedidoCompra pedido : pedidos) {
            if (pedido.isConcluido()) {
                concluidos.add(pedido);
            }
        }
        return concluidos;
    }

    public void atualizarEstoque(PedidoCompra pedido) {
        if (pedido.isConcluido()) {
            // Atualizar o estoque com a quantidade da peça
            // Adicione sua lógica de atualização de estoque aqui
        }
    }
}

