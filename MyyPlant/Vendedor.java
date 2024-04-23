package MyyPlant;

public class Vendedor {
    String nome;

    Integer idade;

    String cidade;

    String bairro;

    String rua;

    Float salarioBase = 1200f;

    Float[] salarioRecebido = new Float[] { 1200f, 2200f, 3200f };

    Loja loja;

    int contador = 0;

    float mediaSalario;

    public void calcularMedia() {

        for (int i = 0; i < contador; i++) {

            mediaSalario += salarioRecebido[i];
            mediaSalario = mediaSalario / salarioRecebido.length;
            System.out.println("Média salarial: " + mediaSalario);
        }
    }

    public void calcularBonus() {
        System.out.println("Bonus salarial: " + salarioBase * 0.2);
    }

    public void apresentarse() {

        String lojaNome = (loja != null) ? loja.nomeFantasia : "Loja não definida";

        String msg = "Nome: "
                .concat(nome)
                .concat("\nIdade: ")
                .concat(Integer.toString(idade))
                .concat("\nLoja: ")
                .concat(lojaNome);
        System.out.println(msg);

        calcularMedia();
        calcularBonus();
    }

}
