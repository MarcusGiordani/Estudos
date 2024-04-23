package MyyPlant;

public class Main {
    
    public static void main(String[] args) {
        
        Loja loja = new Loja();
        loja.nomeFantasia = "MyyPlant";
        loja.cpnj = 1231231230;
        loja.cidade = "Cascavel";
        loja.bairro = "Santo Inacio";
        loja.rua = "Ernesto Barnabe";

        Cliente cliente = new Cliente();
        cliente.nome = "João";
        cliente.idade = 20;

        Cliente cliente2 = new Cliente();
        cliente2.nome = "Marcus";
        cliente2.idade = 30;

        loja.arrayClientes[0] = cliente;
        loja.arrayClientes[1] = cliente2;

        Vendedor vendedor = new Vendedor();
        vendedor.nome = "Pedro";
        vendedor.idade = 25;
        vendedor.loja = loja;

        Vendedor vendedor2 = new Vendedor();
        vendedor2.nome = "Eduarda";
        vendedor2.idade = 25;
        vendedor2.loja = loja;

        loja.arrayVendedores[0] = vendedor;
        loja.arrayVendedores[1] = vendedor2;

        loja.apresentarse();
        loja.contarClientes();
        loja.contarVendedores();

        cliente.apresentarse();
        cliente2.apresentarse();

        vendedor.apresentarse();
        vendedor2.apresentarse();

    }

}
