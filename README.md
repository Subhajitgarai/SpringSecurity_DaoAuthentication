# Spring Security Project

## Overview

This Spring Security project implements a secure REST API with six layers - main, controller, dao, entities, security, and service. The primary focus is on user details management, including user registration and fetching all users.
---
## Controller

The `UserController` is a REST controller mapped to `/userdetails`. It provides two APIs:

- **POST /add:** Add a new user to the database.
- **GET /getall:** Fetch details of all users in the database.
---
## DAO

The `UserDetailsRepo` interface extends `CrudRepository` and includes a method to retrieve user details by username.
---
## Entities

The `UserDe` entity in the `entities` package has fields:
- `userId`
- `userName`
- `userRole`
- `userPassword`
---
## Security

### CustomUser

The `CustomUser` class implements the `UserDetails` interface from Spring Security. It takes a `UserDe` instance in its constructor to initialize user details.

### CustomUserDetailsService

The `CustomUserDetailsService` class implements the `UserDetailsService` interface. It overrides the `loadByUsername` method to load user details using `userDetailsRepo.getuserbyname()`.

## SecurityConfig

The `SecurityConfig` class includes four beans:
- `DaoAuthenticationProvider` for authenticating details from the database.
- `SecurityFilterChain` to authorize requests.
- `PasswordEncoder` returning a `BcryptPasswordEncoder` object for password encoding.
---
## Service

The `UserDetailsService` interface and its implementation define methods to:
- Add user details to the database, encrypting the password with Bcrypt.
- Get details of all users.
--
## Database Configuration

Configure your MySQL database connection in the `application.properties` file:
---
```properties
# application.properties
spring.datasource.name=test
spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=Subhajit@123
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```
---
## Technologies Used
- Spring Boot for rapid development.
- JPA and Hibernate for data persistence.
- Maven as the build tool.
---
## How to Run
1. Ensure `JDK 17` is installed.
2. Clone the repository.
3. Navigate to the project directory.
4. Download `Spring Tools Suit` and run it as a SpringBoot Project
