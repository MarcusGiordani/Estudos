package MyyPlant;

public class Cliente {
    
    String nome;

    Integer idade;

    String cidade;

    String bairro;

    String rua;

    public void apresentarse(){

        String msg = "Nome: "
        .concat(nome)
        .concat(" Idade: ")
        .concat(Integer.toString(idade));
        System.out.println(msg);
    }
    

}
