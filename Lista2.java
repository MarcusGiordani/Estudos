import java.util.Scanner;

public class Lista2 {

    public static void main(String[] args) {

        float precoTotal[] = new float[100];
        int[] quantidadePlanta = new int[100];
        float[] precoUnidade = new float[100];
        float valorCliente;
        float troco;
        int opcao;
        int indiceVenda = 0;
        float[] descontoAplicado = new float[100];

        System.out.println("Escolha uma das opçoes: \n");
        System.out.println("1- Calcular preço total ");
        System.out.println("2- Calcular troco ");
        System.out.println("3- Registro de Vendas");
        System.out.println("4- Sair");
        Scanner leitor = new Scanner(System.in);
        opcao = leitor.nextInt();

        while (opcao != 4) {

            switch (opcao) {
                case 1:
                    float valorTotalVenda;

                    System.out.println("Digite a quantidade de plantas compradas: ");
                    quantidadePlanta[indiceVenda] = leitor.nextInt();
                    leitor.nextLine();
                    System.out.println("Digite o preço unitário: ");
                    precoUnidade[indiceVenda] = leitor.nextFloat();

                    if (quantidadePlanta[indiceVenda] >= 10) {
                        valorTotalVenda = quantidadePlanta[indiceVenda] * precoUnidade[indiceVenda] * 0.95f;
                        descontoAplicado[indiceVenda] = quantidadePlanta[indiceVenda] * precoUnidade[indiceVenda]
                                * 0.05f;
                    } else {
                        valorTotalVenda = quantidadePlanta[indiceVenda] * precoUnidade[indiceVenda];
                    }
                    precoTotal[indiceVenda++] = valorTotalVenda;

                    System.out.println("O valor total da venda é: " + valorTotalVenda);
                    break;

                case 2:
                    float valorPago;

                    System.out.println("Qual o valor dado pelo cliente: ");
                    valorCliente = leitor.nextFloat();
                    leitor.nextLine();

                    System.out.println("Qual o valor pago: ");
                    valorPago = leitor.nextFloat();

                    troco = valorCliente - valorPago;
                    System.out.println("O troco é: " + troco);
                    break;

                case 3:
                    System.out.println("Registro de vendas");
                    for (int i = 0; i < indiceVenda; i++) {
                        System.out.println("Venda: " + (i + 1) + "\n");
                        System.out.println("Quantidade de plantas vendidas: " + quantidadePlanta[i]);
                        System.out.println("Valor da venda: " + precoTotal[i]);
                        System.out.println("Descontos aplicados: " + descontoAplicado[i]);
                    }
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o sistema");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("\n Escolha uma das opçoes: \n");
            System.out.println("1- Calcular preço total ");
            System.out.println("2- Calcular troco ");
            System.out.println("3- Registro de Vendas");
            System.out.println("4- Sair");
            opcao = leitor.nextInt();
            leitor.nextLine();
        }
        System.out.println("Obrigado por utilizar o sistema");
        System.exit(0);
        leitor.close();
    }
}
