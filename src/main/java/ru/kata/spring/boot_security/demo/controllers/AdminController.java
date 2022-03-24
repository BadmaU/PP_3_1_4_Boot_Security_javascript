package ru.kata.spring.boot_security.demo.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.Dao.RoleDAO;
import ru.kata.spring.boot_security.demo.model.Role;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.RoleService;
import ru.kata.spring.boot_security.demo.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Controller
@RequestMapping("/")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping("/admin")
    public String getAllUsers(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
//        model.addAttribute("users", userService.getAllUsers());
        model.addAttribute("roles", roleService.getAllRoles());
        return "admin_bootstrap";
    }

//    @GetMapping(value = "/admin/save")
//    public String addUser(Model model, @AuthenticationPrincipal User user){
//        model.addAttribute("user", user);
//        model.addAttribute("newuser", new User());
//        model.addAttribute("roles", roleService.getAllRoles());
//        return "save";
//    }
//
//    @PostMapping("/admin")
//    public String saveUser(@RequestParam("idRoles") List<Long> idRoles, User user){
//        List<Role> roleList = new ArrayList<>();
//            for (Long id: idRoles){
//                roleList.add(roleService.findRoleById(id));
//            }
//        user.setRoles(roleList);
//        userService.saveUser(user);
//        return "redirect:/admin";
//    }
//
//    @PatchMapping("/admin/update/{id}")
//    public String updateUser(@ModelAttribute("user") User user, @PathVariable("id") long id, Model model, @RequestParam("idRoles") List<Long> idRoles){
//        model.addAttribute("roles", roleService.getAllRoles());
//        List<Role> roleList = new ArrayList<>();
//        for (Long idRs: idRoles){
//            roleList.add(roleService.findRoleById(idRs));
//        }
//        user.setRoles(roleList);
//        userService.updateUserById(id, user);
//        return "redirect:/admin";
//    }
//
//    @DeleteMapping("/admin/remove/{id}")
//    public String removeUserById(@PathVariable("id") long id){
//        userService.removeUserById(id);
//        return "redirect:/admin";
//    }
}