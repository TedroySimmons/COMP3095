package ca.gbc.productservices;

import org.springframework.boot.SpringApplication;

public class TestProductServicesApplication {

    public static void main(String[] args) {
        SpringApplication.from(ProductServicesApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
