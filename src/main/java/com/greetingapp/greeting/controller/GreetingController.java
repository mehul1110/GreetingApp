package com.greetingapp.greeting.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    @GetMapping("/greeting")
    public ResponseEntity<String> getGreeting() {
        return ResponseEntity.ok("{\"message\": \"Hello from GET\"}");
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
