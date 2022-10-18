package br.com.alkimin.serviceWebCourse.repositories;

import br.com.alkimin.serviceWebCourse.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
