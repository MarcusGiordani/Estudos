package myyplant2;

public class Endereco {
    private Integer numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;

    public Endereco(Integer numero, String bairro, String cidade, String estado, String complemento) {
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.complemento = complemento;
    }

    public void apresentarLogradouro() {
        System.out.println("Logradouro: " + estado + ", " + cidade + ", " + bairro + ", " + numero + ", " + complemento);
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
}

