package com.greetingapp.greeting.controller;

import com.greetingapp.greeting.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public ResponseEntity<String> getGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return ResponseEntity.ok(
                greetingService.getGreeting(firstName, lastName));
    }

    @PostMapping("/greeting")
    public ResponseEntity<String> postGreeting() {
        return ResponseEntity.ok("{\"message\": \"Hello from POST\"}");
    }

    @PutMapping("/greeting")
    public ResponseEntity<String> putGreeting() {
        return ResponseEntity.ok("{\"message\": \"Hello from PUT\"}");
    }

    @DeleteMapping("/greeting")
    public ResponseEntity<String> deleteGreeting() {
        return ResponseEntity.ok("{\"message\": \"Hello from DELETE\"}");
    }
}
