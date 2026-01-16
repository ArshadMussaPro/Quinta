package model;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.time.format.DateTimeParseException;

public class AgroProduct extends Product {
    private String type; // date;
    private float expected_tons, harvested_tons;
    private LocalDate date;

    public AgroProduct(String type, float expected_tons, float harvested_tons, String idProduct, String name, float price) {
        super(idProduct, name, price);
        this.type = type;
        this.expected_tons = expected_tons;
        this.harvested_tons = harvested_tons;
        date = LocalDate.now();
    }

    public String gettype() {
        return type;
    }

    public float getexpected_tons() {
        return expected_tons;
    }

    public float getharvested_tons() {
        return harvested_tons;
    }

    public LocalDate getdate() {
        return date;
    }

    public void setexpected_tons(float expected_tons) {
        this.expected_tons = expected_tons;
    }

    public void setharvested_tons(float harvested_tons) {
        this.harvested_tons = harvested_tons;
    }

    public void setdate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  super.toString()+"AgroProduct{" + "type=" + type + ", expected_tons=" + expected_tons + ", harvested_tons=" + harvested_tons + ", date=" + date + '}';
    }
  
}
