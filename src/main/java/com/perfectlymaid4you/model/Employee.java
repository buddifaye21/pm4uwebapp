package com.perfectlymaid4you.model;

import com.sun.istack.internal.NotNull;

import java.sql.Date;
import java.util.Objects;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private double hourlyRate;
    private String email;
    private Date dob;
    private String ssn;
    private String position;
    private Date dateOfHire;
    private Date dateOfTerm;
    private String shirtSize;
    private String emergencyContact;

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public Date getDateOfTerm() {
        return dateOfTerm;
    }

    public void setDateOfTerm(Date dateOfTerm) {
        this.dateOfTerm = dateOfTerm;
    }

    public String getShirtSize() {
        return shirtSize;
    }

    public void setShirtSize(String shirtSize) {
        this.shirtSize = shirtSize;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Double.compare(employee.hourlyRate, hourlyRate) == 0 &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(address, employee.address) &&
                Objects.equals(phone, employee.phone) &&
                Objects.equals(dob, employee.dob) &&
                Objects.equals(ssn, employee.ssn) &&
                Objects.equals(position, employee.position) &&
                Objects.equals(dateOfHire, employee.dateOfHire) &&
                Objects.equals(dateOfTerm, employee.dateOfTerm) &&
                Objects.equals(shirtSize, employee.shirtSize) &&
                Objects.equals(emergencyContact, employee.emergencyContact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, address, phone, hourlyRate, email, dob,ssn,position,dateOfHire,dateOfTerm,shirtSize,emergencyContact);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", email='" + email + '\'' +
                ", dob='" + dob + '\'' +
                ", ssn='" + ssn + '\'' +
                ", position='" + position + '\'' +
                ", dateOfHire='" + dateOfHire + '\'' +
                ", dateOfTerm='" + dateOfTerm + '\'' +
                ", shirtSize='" + shirtSize + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                '}';
    }
}
