package com.banica.vacmanager;

import com.banica.vacmanager.dao.UserRepository;
import com.banica.vacmanager.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class VacationManagerApplication implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public static void main(String[] args) {
        SpringApplication.run(VacationManagerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Inserting Player: {}", userRepository.save(new User("stefan44", "stefan123",
                "Stefan", "Ganchev", "CEO")));

    }
}