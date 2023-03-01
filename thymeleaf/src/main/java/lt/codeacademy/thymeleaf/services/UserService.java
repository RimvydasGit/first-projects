package lt.codeacademy.thymeleaf.services;

import lt.codeacademy.thymeleaf.entities.User;
import lt.codeacademy.thymeleaf.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
       return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
    }
    public void delete(User user) {
        userRepository.delete(user);
    }
}
