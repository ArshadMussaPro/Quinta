package model;

import java.time.LocalDate;
public class Colaborador {
    private String idColab, nome, funcao, contacto, endereco;
    private boolean resQuinta;
    private char genero;
    private LocalDate dataIngresso;

    public Colaborador(String idColab, String nome, String funcao, String contacto, String endereco, boolean resQuinta, char genero) {
        this.idColab = idColab;
        this.nome = nome;
        this.funcao = funcao;
        this.contacto = contacto;
        this.endereco = endereco;
        this.resQuinta = resQuinta;
        this.genero = genero;
        dataIngresso = LocalDate.now();
    }

    public String getIdColab() {
        return idColab;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getContacto() {
        return contacto;
    }

    public String getEndereco() {
        return endereco;
    }

    public boolean isResQuinta() {
        return resQuinta;
    }

    public char getGenero() {
        return genero;
    }

    public LocalDate getDataIngresso() {
        return dataIngresso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setResQuinta(boolean resQuinta) {
        this.resQuinta = resQuinta;
    }

    public void setDataIngresso(LocalDate dataIngresso) {
        this.dataIngresso = dataIngresso;
    }
    
}
