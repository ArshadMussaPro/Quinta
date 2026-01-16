package model;

import java.time.LocalDate;

public class Collaborator {
    private String idCollab, name, role, contact, address;
    private boolean living_in_quinta;
    private char gender;
    private LocalDate starting_date;

    public Collaborator(String idCollab, String name, String role, String contact, String address, boolean living_in_quinta, char gender) {
        this.idCollab = idCollab;
        this.name = name;
        this.role = role;
        this.contact = contact;
        this.address = address;
        this.living_in_quinta = living_in_quinta;
        this.gender = gender;
        starting_date = LocalDate.now();
    }

    public String getIdCollab() {
        return idCollab;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public String getContact() {
        return contact;
    }

    public String getAddress() {
        return address;
    }

    public boolean getLiving_in_quinta() {
        return living_in_quinta;
    }

    public char getGender() {
        return gender;
    }

    public LocalDate getStarting_date() {
        return starting_date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setLiving_in_quinta(boolean living_in_quinta) {
        this.living_in_quinta = living_in_quinta;
    }

    public void setStarting_date(LocalDate starting_date) {
        this.starting_date = starting_date;
    }

}
