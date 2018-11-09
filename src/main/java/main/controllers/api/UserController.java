package main.controllers.api;

import main.dao.services.UserService;
import main.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        userService.saveUser(user);
        return user;
    }

    @PutMapping("/user")
    public User updateUser(@RequestBody User user){
        userService.updateUser(user);
        return user;
    }

    @DeleteMapping("/user/{id}")
    public HttpStatus deleteUser(@PathVariable Long id){
         userService.deleteUserById(id);
         return HttpStatus.OK;
    }
}
