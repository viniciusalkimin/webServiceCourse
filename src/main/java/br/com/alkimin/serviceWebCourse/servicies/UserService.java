package br.com.alkimin.serviceWebCourse.servicies;

import br.com.alkimin.serviceWebCourse.entities.User;
import br.com.alkimin.serviceWebCourse.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository repository;


    public List<User> findAll() {
        return repository.findAll();
    }
}
