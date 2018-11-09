package main.dao.services;

import main.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {

    User findUserById(Long id);

    void saveUser(User user);

    void deleteUserById(Long id);

    void updateUser(User user);
}
