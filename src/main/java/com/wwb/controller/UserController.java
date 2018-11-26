package com.wwb.controller;

import com.wwb.form.UserForm;
import com.wwb.model.User;
import com.wwb.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    public String list(Model model,User user){
        model.addAttribute("userList",userService.findList(user));
        return "user/list";
    }

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "user/register";
    }

    @PostMapping("/register")
    public String processRegistration(@Valid UserForm form, Errors errors) {
        if (errors.hasErrors()) {
            return "user/register";
        }
        User user = new User();
        BeanUtils.copyProperties(form,user);
        userService.save(user);
        return "redirect:/user/" + user.getUsername();
    }

    @RequestMapping(value = "/{username}", method = GET)
    public String showSpitterProfile(@PathVariable String username, Model model) {
        User user = userService.findByUsername(username);
        model.addAttribute("user",user);
        return "user/profile";
    }
}
