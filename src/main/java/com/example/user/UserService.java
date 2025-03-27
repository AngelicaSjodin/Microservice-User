package com.example.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    //ref t repo
    private UserRepository userRepository;

    //const
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //da methods
    public void createUser(User user){
        userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }




}
