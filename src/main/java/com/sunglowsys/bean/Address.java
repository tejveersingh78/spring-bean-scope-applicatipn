package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Value;


public class Address {
    private String id;
    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String state;
    private String country;
    private String zipcode;

    public Address() {
        System.out.println("Address object is created");
    }


    public String getId() {
        return id;
    }

    @Value("ts11")
    public void setId(String id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    @Value("Vill-Rampur")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    @Value("Post-Mohanpura")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    @Value("Dist-Kasganj")
    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getState() {
        return state;
    }

    @Value("Uttar Pradesh")
    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    @Value("India")
    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Value("207123")
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
}