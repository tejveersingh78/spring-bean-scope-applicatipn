package com.sunglowsys;


import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Customer;
import com.sunglowsys.configuration.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

        Customer cust = context.getBean(Customer.class);
        System.out.println("Id: " + cust.getId());
        System.out.println("FirstName: " + cust.getFirstName());
        System.out.println("LastName: " + cust.getLastName());
        System.out.println("Email: " + cust.getEmail());
        System.out.println("Mobile: " + cust.getMobile());

        System.out.println();

        Customer cust1 = context.getBean(Customer.class);
        System.out.println("Id: " + cust1.getId());
        System.out.println("FirstName: " + cust1.getFirstName());
        System.out.println("LastName: " + cust1.getLastName());
        System.out.println("Email: " + cust1.getEmail());
        System.out.println("Mobile: " + cust1.getMobile());

        System.out.println(cust.hashCode());
        System.out.println(cust1.hashCode());



        Address address1 = context.getBean(Address.class);


        System.out.println("Id: " + address1.getId());
        System.out.println("AddressLine1: " + address1.getAddressLine1());
        System.out.println("AddressLine2: " + address1.getAddressLine2());
        System.out.println("AddressLine3: " + address1.getAddressLine3());
        System.out.println("State: " + address1.getState());
        System.out.println("Country: " + address1.getCountry());
        System.out.println("Zipcode: " + address1.getZipcode());

        System.out.println();


        Address address2 = context.getBean(Address.class);
        System.out.println("Id: " + address2.getId());
        System.out.println("AddressLine1: " + address2.getAddressLine1());
        System.out.println("AddressLine2: " + address2.getAddressLine2());
        System.out.println("AddressLine3: " + address2.getAddressLine3());
        System.out.println("State: " + address2.getState());
        System.out.println("Country: " + address2.getCountry());
        System.out.println("Zipcode: " + address2.getZipcode());


        System.out.println(address1.hashCode());
        System.out.println(address2.hashCode());
    }
}