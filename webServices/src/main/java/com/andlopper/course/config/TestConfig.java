package com.andlopper.course.config;

import com.andlopper.course.entities.User;
import com.andlopper.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test") //Mesmo nome utilizado no arquivo application.properties
public class TestConfig implements CommandLineRunner {

    @Autowired //Spring resolve a dependência e associa uma instância do UserRepository
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        //O que estiver neste método será executado ao iniciar a aplicação

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2)); //Registrando no BD
    }
}
