package edu.miu.cs489.lab6.adssurgerydentalcli;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdsSurgeryDentalCliApplication implements CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(AdsSurgeryDentalCliApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello data persistents using spring data JPA");
    }
}
