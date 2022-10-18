package br.com.alkimin.serviceWebCourse.resources;

import br.com.alkimin.serviceWebCourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> getOneUser() {
        var user = new User(1L, "Vinicius Alkimin", "vinicius.alkimin@hotmail.com", "11991234567", "secreta");
        return ResponseEntity.ok().body(user);
    }

}
