package com.greetingapp.greeting.controller;

import com.greetingapp.greeting.model.GreetingEntity;
import com.greetingapp.greeting.service.GreetingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

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
    public ResponseEntity<GreetingEntity> createGreeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return ResponseEntity.ok(
                greetingService.saveGreeting(firstName, lastName));
    }

    @GetMapping("/greeting/{id}")
    public ResponseEntity<GreetingEntity> getGreetingById(
            @PathVariable Long id) {
        return ResponseEntity.ok(
                greetingService.findGreetingById(id));
    }
}
