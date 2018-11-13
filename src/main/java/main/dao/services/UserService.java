package main.dao.services;

import main.entity.User;


import java.util.List;


public interface UserService {

    User findUserById(Long id);

    List<User> findAll();

    void saveUser(User user);

    void deleteUserById(Long id);

    void updateUser(User user);


}
