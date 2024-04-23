package MyyPlant;

public class Loja {
    
    String nomeFantasia;
    String razaoSocial;
    double cpnj;
    String cidade;
    String bairro;
    String rua;
    
    Cliente[] arrayClientes = new Cliente[100] ;
    Vendedor[] arrayVendedores = new Vendedor[100];

    public void contarClientes(){
       
        int contadorClientes = 0;
        for (Cliente cliente : arrayClientes) {
            if (cliente != null) {
                contadorClientes++;
            }
        }
        System.out.println("Quantidade de clientes: " + contadorClientes);
    }
    
    public void contarVendedores(){
        
        int contadorVendedores = 0;
        for (Vendedor vendedor : arrayVendedores) {
            if (vendedor != null) {
                contadorVendedores++;
            }
        }
    
        System.out.println("Quantidade de vendedores: " + contadorVendedores);
    }
    
    public void apresentarse(){
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

}
