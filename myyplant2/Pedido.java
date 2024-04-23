package myyplant2;

import java.util.Date;

public class Pedido {

    private Integer id;
    private String cliente;
    private String vendedor;
    private String Loja;
    private Item[] arrayItens = new Item[100];
    private Date dataCriacao;
    private Date dataPagamento;
    private Date dataVencimentoReserva;

    public Pedido(Integer id, String cliente, String vendedor, String loja, Item[] arrayItens, Date dataCriacao,
            Date dataPagamento, Date dataVencimentoReserva) {
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        Loja = loja;
        this.arrayItens = arrayItens;
        this.dataCriacao = new Date();
        this.dataVencimentoReserva = calcularDataVencimentoReserva(this.dataCriacao);
    }

    private Date calcularDataVencimentoReserva(Date dataCriacao) {

        long tresDiasEmMs = 259200000l;
        long dataVencimentoMs = dataCriacao.getTime() + tresDiasEmMs;
        return new Date(dataVencimentoMs);
    }

    public void processarPedido() {
        System.out.println("Pedido processado com sucesso!");
    }

    // Método para confirmar o pagamento do pedido
    public void confirmarPagamento() {
        System.out.println("Pagamento confirmado para o pedido!");
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public String getLoja() {
        return Loja;
    }

    public void setLoja(String loja) {
        Loja = loja;
    }

    public Item[] getArrayItens() {
        return arrayItens;
    }

    public void setArrayItens(Item[] arrayItens) {
        this.arrayItens = arrayItens;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Date getDataVencimentoReserva() {
        return dataVencimentoReserva;
    }

    public void setDataVencimentoReserva(Date dataVencimentoReserva) {
        this.dataVencimentoReserva = dataVencimentoReserva;
    }

}
