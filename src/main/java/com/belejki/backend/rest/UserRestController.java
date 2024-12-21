package com.belejki.backend.rest;

import com.belejki.backend.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/admin")
public class UserRestController {

    @GetMapping("/users")
    public ArrayList<User> showUsers() {
        return new ArrayList<>();
    }
}
