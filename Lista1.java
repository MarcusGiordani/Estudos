import java.util.Scanner;

public class Lista1 {

    public static void main(String[] args) {

        float precoTotal;
        int quantidadePlanta;
        float precoUnidade;
        float valorCliente;
        float troco;
        int opcao;

        System.out.println("Escolha uma das opçoes: \n");
        System.out.println("1- Calcular preço total ");
        System.out.println("2- Calcular troco ");
        System.out.println("3- Sair");
        Scanner leitor1 = new Scanner(System.in);
        opcao = leitor1.nextInt();

        if (opcao == 1) {
            System.out.println("Digite a quantidade de plantas compradas: ");
            quantidadePlanta = leitor1.nextInt();
            System.out.println("Digite o preço unitário: ");
            precoUnidade = leitor1.nextFloat();

            precoTotal = quantidadePlanta * precoUnidade;
            System.out.println("O preço total é: " + precoTotal);
        } else if (opcao == 2) {
            System.out.println("Qual o valor dado pelo cliente: ");
            valorCliente = leitor1.nextFloat();
            System.out.println("Qual o valor pago: ");
            precoTotal = leitor1.nextFloat();
            troco = valorCliente - precoTotal;
            System.out.println("O troco é: " + troco);
        } else if (opcao == 3) {
            System.out.println("Obrigado por utilizar o sistema");
            System.exit(0);
        } else {
            System.out.println("Opção inválida");
        }
        leitor1.close();
    }
}
