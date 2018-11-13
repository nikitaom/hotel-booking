package main.controllers.view;

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
public class UserViewController {


    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String getMainP(ModelMap model) {
       // model.addAttribute("users",userService.findAll());
               return "main";
    }

    @GetMapping("/new-user")
    public String newUsers(ModelMap modelMap) {
        modelMap.addAttribute("user",new User());
        return "create_user";
    }

    @PostMapping("/new-user")
    public String newUser(User user){
        userService.saveUser(user);
        return "redirect:/all-users";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable long id) {
        userService.deleteUserById(id);
        return "redirect:/all-users";
    }

    @GetMapping("/all-users")
    public String showAllUsers(ModelMap model){
        model.addAttribute("users",userService.findAll());
        return "index";
    }

}
