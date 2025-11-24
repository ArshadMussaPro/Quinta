package model;

public class PPecuario extends Produto {
    private String raca, genero;
    private int idade; float peso;

    public PPecuario(String raca, String genero, int idade, float peso, String idProduto, String nome, float preco) {
        super(idProduto, nome, preco);
        this.raca = raca;
        this.genero = genero;
        this.idade = idade;
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public String getGenero() {
        return genero;
    }

    public int getIdade() {
        return idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+"PPecuario{" + "raca=" + raca + ", genero=" + genero + ", idade=" + idade + ", peso=" + peso + '}';
    }
   
}
