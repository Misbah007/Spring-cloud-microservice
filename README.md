﻿**Microservices Architecture with Spring Boot**

**Overview**

This project is a microservices-based architecture implemented using Spring Boot. It consists of multiple services that interact with each other, leveraging service discovery, caching, API Gateway, and circuit breaker mechanisms.

**Microservices**

1. **School Service** 
- Manages school-related operations. 
- Uses **MySQL** as the database. 
- Exposes REST APIs for CRUD operations. 
2. **Student Service** 
- Manages student-related operations. 
- Uses **MongoDB** as the database. 
- Exposes REST APIs for CRUD operations. 

**Supporting Services**

3. **Discovery Server (Register Service)** 
- Implemented using **Eureka Server**. 
- Allows microservices to register and discover each other.
4. **API Gateway** 
- Used for routing client requests to the appropriate microservice.
- Implements **Spring Cloud Gateway**. 
5. **Caching** 
- Implemented using **Spring Cache**. 
- Helps in reducing database calls and improving performance.
6. **Circuit Breaker** 
- Implemented using **Resilience4j**. 
- Prevents failures from propagating across the system. 
7. **Security**
- Implemented using **Keycloak OAuth2**. 
- Ensures secure authentication and authorization for all microservices

**Technologies Used**

- **Spring Boot** (Microservices Framework) 
- **Spring Cloud** (Eureka, API Gateway, Resilience4j, Security) 
- **MySQL** (Relational Database for School Service) 
- **MongoDB** (NoSQL Database for Student Service) 
- **Spring Cache** (Caching Mechanism) 
- **Docker** (Containerization) 
- **Docker Swarm** (Deployment & Orchestration) 
- **Nginx** (For Load Balancing & Reverse Proxy) 
- **Keycloak OAuth2** (Authentication & Authorization) 

**Running the Project**

**Prerequisites** 

- Java 17+ 
- Maven 
- Docker & Docker Swarm 
- MySQL & MongoDB 
- Keycloak Server 
