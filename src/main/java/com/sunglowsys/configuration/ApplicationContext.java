package com.sunglowsys.configuration;

import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Customer;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ApplicationContext {
    @Bean
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Customer getCustomer(){
        return new Customer();
    }

    @Bean
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Address getAddress(){
        return new Address();
    }
}
