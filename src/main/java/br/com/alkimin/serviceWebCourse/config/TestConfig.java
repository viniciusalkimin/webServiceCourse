package br.com.alkimin.serviceWebCourse.config;

import br.com.alkimin.serviceWebCourse.entities.User;
import br.com.alkimin.serviceWebCourse.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.reflect.Array;
import java.util.Arrays;

@Configuration
@Profile("test")
@AllArgsConstructor
public class TestConfig implements CommandLineRunner {

    private UserRepository repository;


    @Override
    public void run(String... args) throws Exception {
        var user = new User(1L, "Vinicius Alkimin", "vinicius.alkimin@hotmail.com", "11991234567", "secreta");
        var user1 = new User(null,"Davi Alkimin","davi@hotmail.com","9612345678","supersecreta");
        var user2 = new User(null,"Mayara Alkimin","mayara@hotmail.com","9612345678","supersecretamesmo");
        repository.saveAll(Arrays.asList(user,user1,user2));
    }
}
