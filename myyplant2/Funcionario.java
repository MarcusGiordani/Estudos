package myyplant2;

public class Funcionario {
    private String nome;
    private Integer idade;
    private Loja loja;
    private Endereco endereco;
    private Float salarioBase;
    private Float[] salarioRecebido;

    public Funcionario(String nome, Integer idade, Loja loja, Float salarioBase, Float[] salarioRecebido) {
        this.nome = nome;
        this.idade = idade;
        this.loja = loja;
        this.salarioBase = salarioBase;
        this.salarioRecebido = salarioRecebido;
    }

    public void apresentarse() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Loja: " + loja.getNomeFantasia());
    }

    public void calcularMedia() {
        float total = 0;
        for (float salario : salarioRecebido) {
            total += salario;
        }
        float media = total / salarioRecebido.length;
        System.out.println("Média salarial: " + media);
    }

    public void calcularBonus() {
        System.out.println("Bonus salarial: " + salarioBase * 0.2);
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

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Float[] getSalarioRecebido() {
        return salarioRecebido;
    }

    public void setSalarioRecebido(Float[] salarioRecebido) {
        this.salarioRecebido = salarioRecebido;
    }

}
