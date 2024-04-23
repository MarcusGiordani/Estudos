package myyplant2;

public class Cliente {

    private String nome;
    private Integer idade;
    private Endereco endereco;

    public Cliente(String nome, Integer idade, String cidade, String bairro, String rua) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = new Endereco(0, bairro, cidade, "", rua);
    }

    public void apresentarse() {

        String msg = "Nome: "
                .concat(nome)
                .concat(" Idade: ")
                .concat(Integer.toString(idade));
        System.out.println(msg);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
