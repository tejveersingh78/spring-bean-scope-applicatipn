package com.sunglowsys.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;


public class Customer {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String mobile;


    public Customer(){
        System.out.println("Customer object is created");
    }


    public Long getId() {
        return id;
    }

    @Value("10")
    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    @Value("Tejveer")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Value("Singh")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    @Value("ts@gmail.com")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    @Value("8936946956")
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}
