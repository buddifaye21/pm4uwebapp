package com.perfectlymaid4you.model;

import java.util.Objects;

public class Client {

    private int id;
    private String name;
    private String address;
    private String primaryPhone;
    private String additionalPhone;
    private String email;
    private String cleaningtype;
    private double initialCharge;
    private double price;
    private Boolean active;
    private String notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrimaryPhone() {
        return primaryPhone;
    }

    public void setPrimaryPhone(String primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    public String getAdditionalPhone() {
        return additionalPhone;
    }

    public void setAdditionalPhone(String additionalPhone) {
        this.additionalPhone = additionalPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCleaningtype() {
        return cleaningtype;
    }

    public void setCleaningtype(String cleaningtype) {
        this.cleaningtype = cleaningtype;
    }

    public double getInitialCharge() {
        return initialCharge;
    }

    public void setInitialCharge(double initialCharge) {
        this.initialCharge = initialCharge;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id &&
                Double.compare(client.initialCharge, initialCharge) == 0 &&
                Double.compare(client.price, price) == 0 &&
                Objects.equals(name, client.name) &&
                Objects.equals(address, client.address) &&
                Objects.equals(primaryPhone, client.primaryPhone) &&
                Objects.equals(additionalPhone, client.additionalPhone) &&
                Objects.equals(email, client.email) &&
                Objects.equals(cleaningtype, client.cleaningtype) &&
                Objects.equals(active, client.active) &&
                Objects.equals(notes, client.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address, primaryPhone, additionalPhone, email, cleaningtype, initialCharge, price, active, notes);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", primaryPhone='" + primaryPhone + '\'' +
                ", additionalPhone='" + additionalPhone + '\'' +
                ", email='" + email + '\'' +
                ", cleaningtype='" + cleaningtype + '\'' +
                ", initialCharge=" + initialCharge +
                ", price=" + price +
                ", active=" + active +
                ", notes='" + notes + '\'' +
                '}';
    }
}
