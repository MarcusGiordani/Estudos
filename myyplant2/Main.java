package myyplant2;

public class Main {

    public static void main(String[] args) {
        Loja loja = new Loja();
        loja.setNomeFantasia("MyyPlant");
        loja.setCpnj(1231231230);
        loja.setCidade("Cascavel");
        loja.setBairro("Santo Inacio");
        loja.setRua("Ernesto Barnabe");

        Cliente cliente = new Cliente("João", 20, "Cascavel", "Bairro1", "Rua1");
        Cliente cliente2 = new Cliente("Marcus", 30, "Cascavel", "Bairro2", "Rua2");

        loja.getArrayClientes()[0] = cliente;
        loja.getArrayClientes()[1] = cliente2;

        Vendedor vendedor = new Vendedor("Pedro", 25, loja, 1200f, new Float[]{1200f, 2200f, 3200f});
        Vendedor vendedor2 = new Vendedor("Eduarda", 25, loja, 1200f, new Float[]{1200f, 2200f, 3200f});

        loja.getArrayVendedores()[0] = vendedor;
        loja.getArrayVendedores()[1] = vendedor2;

        loja.apresentarse();
        loja.contarClientes();
        loja.contarVendedores();

        cliente.apresentarse();
        cliente.getEndereco().apresentarLogradouro(); // Chamar o método na instância de Endereco do cliente

        cliente2.apresentarse();
        cliente2.getEndereco().apresentarLogradouro(); // Chamar o método na instância de Endereco do cliente2

        vendedor.apresentarse();
        vendedor.getLoja().getEndereco().apresentarLogradouro(); // Chamar o método na instância de Endereco da loja do vendedor

        vendedor2.apresentarse();
        vendedor2.getLoja().getEndereco().apresentarLogradouro(); // Chamar o método na instância de Endereco da loja do vendedor2
    }
}

