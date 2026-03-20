package com.greetingapp.greeting.service;

import com.greetingapp.greeting.model.GreetingEntity;
import com.greetingapp.greeting.repository.GreetingRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GreetingService {

    private final GreetingRepository greetingRepository;

    public GreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public String getGreeting(String firstName, String lastName) {
        if (firstName != null && !firstName.isEmpty() &&
            lastName != null && !lastName.isEmpty()) {
            return "Hello " + firstName + " " + lastName;
        } else if (firstName != null && !firstName.isEmpty()) {
            return "Hello " + firstName;
        } else if (lastName != null && !lastName.isEmpty()) {
            return "Hello " + lastName;
        } else {
            return "Hello World";
        }
    }

    public GreetingEntity saveGreeting(String firstName, String lastName) {
        String message = getGreeting(firstName, lastName);
        GreetingEntity entity = new GreetingEntity();
        entity.setMessage(message);
        return greetingRepository.save(entity);
    }

    public GreetingEntity findGreetingById(Long id) {
        return greetingRepository.findById(id)
            .orElseThrow(() ->
                new RuntimeException(
                    "Greeting not found with id: " + id));
    }

    public List<GreetingEntity> findAllGreetings() {
        return greetingRepository.findAll();
    }

    public GreetingEntity updateGreeting(Long id, String message) {
        GreetingEntity entity = greetingRepository.findById(id)
            .orElseThrow(() ->
                new RuntimeException(
                    "Greeting not found with id: " + id));
        entity.setMessage(message);
        return greetingRepository.save(entity);
    }

    public void deleteGreeting(Long id) {
        if (!greetingRepository.existsById(id)) {
            throw new RuntimeException(
                "Greeting not found with id: " + id);
        }
        greetingRepository.deleteById(id);
    }
}
