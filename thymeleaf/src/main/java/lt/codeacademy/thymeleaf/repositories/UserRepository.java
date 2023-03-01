package lt.codeacademy.thymeleaf.repositories;

import lt.codeacademy.thymeleaf.entities.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
