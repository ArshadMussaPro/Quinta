package model;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;

public class PAgricola extends Produto {
    private String tipo; // data;
    private float tonEsp, tonColh;
    private LocalDate data;

    public PAgricola(String tipo, float tonEsp, float tonColh, String idProduto, String nome, float preco) {
        super(idProduto, nome, preco);
        this.tipo = tipo;
        this.tonEsp = tonEsp;
        this.tonColh = tonColh;
        data = LocalDate.now();
    }

    public String getTipo() {
        return tipo;
    }

    public float getTonEsp() {
        return tonEsp;
    }

    public float getTonColh() {
        return tonColh;
    }

    public LocalDate getData() {
        return data;
    }

    public void setTonEsp(float tonEsp) {
        this.tonEsp = tonEsp;
    }

    public void setTonColh(float tonColh) {
        this.tonColh = tonColh;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return  super.toString()+"PAgricola{" + "tipo=" + tipo + ", tonEsp=" + tonEsp + ", tonColh=" + tonColh + ", data=" + data + '}';
    }
  
}
