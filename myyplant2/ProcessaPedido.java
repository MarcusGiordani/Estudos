package myyplant2;

import java.util.Date;

public class ProcessaPedido {

    // Método para processar o pedido
    public static void processarPedido(Pedido pedido) {
        // Chamando o método processarPedido() do objeto Pedido
        pedido.processarPedido();
    }

    // Método para confirmar o pagamento do pedido
    public static void confirmarPagamento(Pedido pedido) {
        // Chamando o método confirmarPagamento() do objeto Pedido
        pedido.confirmarPagamento();
    }

    public static void main(String[] args) {
        // Exemplo de uso dos métodos
        Pedido pedido = criarPedidoExemplo(); // Método fictício para criar um pedido de exemplo
        processarPedido(pedido);
        confirmarPagamento(pedido);
    }

    // Método fictício para criar um pedido de exemplo
    private static Pedido criarPedidoExemplo() {
        Integer id = 1;
        String cliente = "Cliente Exemplo";
        String vendedor = "Vendedor Exemplo";
        String loja = "Loja Exemplo";
        Item[] arrayItens = new Item[1]; // Array de itens (um exemplo com um item)
        Item itemExemplo = new Item(1, "Item Exemplo", "Tipo Exemplo", 100.0f); // Criando um item de exemplo
        arrayItens[0] = itemExemplo;
        Date dataCriacao = new Date(); // Data de criação atual
        Date dataPagamento = null; // Definido como null, pois o pagamento ainda não foi confirmado
        Date dataVencimentoReserva = null; // Definido como null, pois a reserva ainda não foi vencida
        return new Pedido(id, cliente, vendedor, loja, arrayItens, dataCriacao, dataPagamento, dataVencimentoReserva);
    }
}
