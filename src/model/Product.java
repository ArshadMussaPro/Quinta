package model;

public class Product {
    protected String idProduct;
    protected String name;
    protected float price;

    public Product(String idProduct, String name, float price) {
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" + "idProduct=" + idProduct + ", name=" + name + ", price=" + price + '}';
    }

}