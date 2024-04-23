package myyplant2;

public class Vendedor extends Funcionario {

    public Vendedor(String nome, Integer idade, Loja loja, Float salarioBase, Float[] salarioRecebido) {
        super(nome, idade, loja, salarioBase, salarioRecebido);
    }

    public void apresentarse() {
        String lojaNome = (getLoja() != null) ? getLoja().getNomeFantasia() : "Loja não definida";

        String msg = "Nome: "
                .concat(getNome())
                .concat("\nIdade: ")
                .concat(Integer.toString(getIdade()))
                .concat("\nLoja: ")
                .concat(lojaNome);
        System.out.println(msg);

        calcularMedia();
        calcularBonus();
    }

}
