package main.controllers;

import main.dao.repository.UserRepository;
import main.dao.services.UserService;
import main.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class UserControllers {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserService userService;


    @GetMapping("/")
    public String getMainP(ModelMap model) {
        model.addAttribute("users",userRepository.findAll());
               return "index";
    }

    @GetMapping("/new-user")
    public String newUsers(ModelMap modelMap) {
        modelMap.addAttribute("user",new User());
        return "create";
    }

    @PostMapping("/new-user")
    public String newUser(User user){
        userRepository.save(user);
        return "index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        userRepository.delete(id);
        return "redirect:/";
    }

}
