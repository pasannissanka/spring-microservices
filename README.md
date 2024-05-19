
## Spring Microservices

This project is a Hotel Management Application using Spring Boot and Microservices Architecture Deployed on Kubernetes.

### Requirements

- Java 21
- Maven
- Docker
- Kubernetes
- Kind

### Structure

``` bash
.
├── beans
│   ├── src/main/java/com/solvedcard/beans
│   │   ├── constants (Global constants - Shared across all services)
│   │   ├── dtos (DTOs)
│   │   ├── entities (DB Entities - Shared across all services)
│   │   └── exceptions (Custom Exceptions)
│   └── pom.xml
├── core
│   ├── src/main/java/com/solvedcard/core
│   │   ├── config (Configurations - Shared across all services
│   │   ├── mappers (DTO mappers - Shared across all services)
│   │   ├── repositories (Repositories - Shared across all services)
│   │   └── services (Services - Shared across all services)
│   └── pom.xml
├── hotel-service (Hotel Service - Manages hotel operations)
│   ├── src/main/java/com/solvedcard/hotelservice
│   │   ├── constants 
│   │   ├── controllers
│   │   ├── services
│   │   └── HotelServiceApplication.java
│   └── pom.xml
├── staff-service
│   ├── src/main/java/com/solvedcard/staffservice
│   │   ├── constants 
│   │   ├── controllers
│   │   ├── services
│   │   └── StaffServiceApplication.java
│   └── pom.xml
├── k8s
│   ├── service.yml
│   └── deployment.yml
└── pom.xml (Root pom)
```
