package myyplant2;

public class Loja {
    private String nomeFantasia;
    private double cpnj;
    private String cidade;
    private String bairro;
    private String rua;
    private Cliente[] arrayClientes = new Cliente[100];
    private Vendedor[] arrayVendedores = new Vendedor[100];
    private Endereco endereco;

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void contarClientes() {

        int contadorClientes = 0;
        for (Cliente cliente : arrayClientes) {
            if (cliente != null) {
                contadorClientes++;
            }
        }
        System.out.println("Quantidade de clientes: " + contadorClientes);
    }

    public void contarVendedores() {

        int contadorVendedores = 0;
        for (Vendedor vendedor : arrayVendedores) {
            if (vendedor != null) {
                contadorVendedores++;
            }
        }

        System.out.println("Quantidade de vendedores: " + contadorVendedores);
    }

    public void apresentarEndereco() {
        if (endereco != null) {
            endereco.apresentarLogradouro(); // Método da classe Endereco
        } else {
            System.out.println("Endereço não definido para esta loja.");
        }
    }

    public void apresentarse() {
        String msg = "Nome fantasia: "
                .concat(nomeFantasia)
                .concat("\nCnpj: ")
                .concat(Double.toString(cpnj))
                .concat("\nEndereço: ")
                .concat("\nCidade " + cidade)
                .concat("\nBairro " + bairro)
                .concat("\nRua " + rua);
        System.out.println(msg);
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public double getCpnj() {
        return cpnj;
    }

    public void setCpnj(double cpnj) {
        this.cpnj = cpnj;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Cliente[] getArrayClientes() {
        return arrayClientes;
    }

    public void setArrayClientes(Cliente[] arrayClientes) {
        this.arrayClientes = arrayClientes;
    }

    public Vendedor[] getArrayVendedores() {
        return arrayVendedores;
    }

    public void setArrayVendedores(Vendedor[] arrayVendedores) {
        this.arrayVendedores = arrayVendedores;
    }

}
