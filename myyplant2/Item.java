package myyplant2;

public class Item {

    private Integer id;
    private String nome;
    private String tipo;
    private Float valor;

    public Item(int id, String nome, String tipo, Float valor) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.valor = valor;
    }

    public void gerarDescricao() {

        String msg = "Id: "
                .concat(String.valueOf(id))
                .concat(" Nome: ")
                .concat(nome)
                .concat(" Tipo: ")
                .concat(tipo)
                .concat(" Valor: ")
                .concat(String.valueOf(valor));
        System.out.println(msg);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }
}
