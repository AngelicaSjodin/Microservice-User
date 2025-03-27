package com.example.user;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    //ref t repo
    private UserRepository userRepository;

    //const
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(User user){
        userRepository.save(user);
    }



}
