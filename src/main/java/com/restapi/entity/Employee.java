package com.restapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String shipping_address;
    private String billing_address;

    public Employee(int id, String shipping_address, String billing_address) {
        this.id = id;
        this.shipping_address = shipping_address;
        this.billing_address = billing_address;
    }

    public Employee() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShipping_address() {
        return shipping_address;
    }

    public void setShipping_address(String shipping_address) {
        this.shipping_address = shipping_address;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", shipping_address='" + shipping_address + '\'' +
                ", billing_address='" + billing_address + '\'' +
                '}';
    }
}
