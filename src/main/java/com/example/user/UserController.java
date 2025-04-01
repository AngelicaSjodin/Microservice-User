package com.example.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final WebClient webClient;
    private final UserRepository userRepository;

    public UserController(WebClient.Builder webClientBuilder, UserRepository userRepository, UserService userService) {
        //vilken port andra filen är på
        this.webClient = webClientBuilder.baseUrl("http://localhost:8082").build();
        this.userRepository = userRepository;
        this.userService = userService;
    }





//    //posta en user (gamla)
//    @PostMapping
//    public void createNewUser (@RequestBody User user){
//        userService.createUser(user);
//    }
    //posta en user
    @PostMapping
    public User createNewUser (@RequestBody User user){
        return userRepository.save(user);
    }

    //hämta alla users (gamla)
//    @GetMapping
//    public ResponseEntity <List<User>> getAllUsers(){
//        return ResponseEntity.ok(userService.getAllUsers());
//    }
    @GetMapping("/{id}")
    public Mono<UserResponse> getUserById(@PathVariable Long id){
        return userRepository.findById(id).map(user ->
                webClient.get()
                        .uri("/payments/"+user.getPaymentId())
                        .retrieve().bodyToMono(Payments.class)
                        .map(payments -> new UserResponse(user,payments)))
                .orElse(Mono.empty());
    }

}



//    @GetMapping("/{id}")
//    //mono = endast ett värde eller inget? istället för optional
//    public Mono<OrderResponse> getOrderById(@PathVariable Long id){
//        return orderRepository.findById(id).map(order ->
//                        webClient.get()
//                                //andra filen
//                                .uri("/users/" + order.getUserId())
//                                .retrieve().bodyToMono(User.class)
//                                .map(user -> new OrderResponse(order,user)))
//                .orElse(Mono.empty());
//    }
//
//}






