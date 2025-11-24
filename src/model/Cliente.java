package model;

public class Cliente {
    private String idCliente, nome, contacto, endereco;

    public Cliente(String idCliente, String nome, String contacto, String endereco) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.contacto = contacto;
        this.endereco = endereco;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getContacto() {
        return contacto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idCliente=" + idCliente + ", nome=" + nome + ", contacto=" + contacto + ", endereco=" + endereco + '}';
    }
    
    
}
