package com.example.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    //endpoint för hämta id och posta
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public void createNewUser (@RequestBody User user){
        userService.createUser(user);
    }

    @GetMapping
    public ResponseEntity <List<User>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }


}
