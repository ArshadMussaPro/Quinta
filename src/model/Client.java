package model;

public class Client {
    private String idClient, name, contact, address;

    public Client(String idClient, String name, String contact, String address) {
        this.idClient = idClient;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    public String getIdClient() {
        return idClient;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Client{" + "idClient=" + idClient + ", name=" + name + ", contact=" + contact + ", address=" + address
                + '}';
    }

}
