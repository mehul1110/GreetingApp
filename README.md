# Greeting App

A Spring Boot backend application providing a comprehensive REST API for managing greetings, complete with a MySQL database integration.

## Features & Use Cases

This application implements 8 key Use Cases (UC) to demonstrate a complete backend flow:

- **UC1 - HTTP Methods**: Basic `GreetingController` to handle `GET`, `POST`, `PUT`, and `DELETE` requests with simple JSON responses.
- **UC2 - Service Layer**: Introduction of `GreetingService` to separate business logic, returning a simple "Hello World".
- **UC3 - Dynamic Greetings**: Extended service layer to handle optional `firstName` and `lastName` query parameters dynamically.
- **UC4 - Database Integration**: Integrated `Spring Data JPA` with `MySQL` to save dynamically generated greetings into the database via a `POST` endpoint.
- **UC5 - Find by ID**: Added `GET /greeting/{id}` endpoint to retrieve specific greeting records from the database.
- **UC6 - List Greetings**: Added `GET /greetings` endpoint to retrieve all saved greetings from the database.
- **UC7 - Update Greeting**: Added `PUT /greeting/{id}` endpoint allowing updating the message of an existing greeting.
- **UC8 - Delete Greeting**: Added `DELETE /greeting/{id}` endpoint to remove a greeting from the database.

## Technologies Used

- **Java 17**
- **Spring Boot 3.x / 4.x** (Web, Data JPA)
- **MySQL Database**
- **Lombok**
- **Maven**
