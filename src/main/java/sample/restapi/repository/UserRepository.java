package sample.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.restapi.entity.User;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);
}
