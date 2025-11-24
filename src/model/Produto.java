package model;

public class Produto {
    private String idProduto, nome;
    private float preco;

    public Produto(String idProduto, String nome, float preco) {
        this.idProduto = idProduto;
        this.nome = nome;
        this.preco = preco;
    }

    public String getIdProduto() {
        return idProduto;
    }

    public String getNome() {
        return nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "idProduto=" + idProduto + ", nome=" + nome + ", preco=" + preco + '}';
    }
    
}
