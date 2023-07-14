package com.andlopper.course.config;

import com.andlopper.course.entities.Order;
import com.andlopper.course.entities.User;
import com.andlopper.course.entities.enums.OrderStatus;
import com.andlopper.course.repositories.OrderRepository;
import com.andlopper.course.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test") //Mesmo nome utilizado no arquivo application.properties
public class TestConfig implements CommandLineRunner {

    @Autowired //Spring resolve a dependência e associa uma instância do UserRepository
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {
        //O que estiver neste método será executado ao iniciar a aplicação

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2)); //Registrando no BD
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

    }
}
