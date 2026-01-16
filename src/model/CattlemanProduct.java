package model;

public class CattlemanProduct extends Product {
    private String race, gender;
    private int age; float weight;

    public CattlemanProduct(String race, String gender, int age, float weight, String idProduct, String name, float price) {
        super(idProduct, name, price);
        this.race = race;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public String getrace() {
        return race;
    }

    public String getgender() {
        return gender;
    }

    public int getage() {
        return age;
    }

    public float getweight() {
        return weight;
    }

    public void setage(int age) {
        this.age = age;
    }

    public void setweight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString()+"CattlemanProduct{" + "race=" + race + ", gender=" + gender + ", age=" + age + ", weight=" + weight + '}';
    }
   
}
