# Microservices Architecture:
 
This microservices setup utilizes Eureka Server for service registration and discovery. User and Contact microservices communicate through Eureka, while an API Gateway handles external client requests, directing them to the appropriate microservices. The design focuses on scalability, flexibility, and secure communication, with monitoring, logging, and detailed documentation ensuring a reliable and maintainable system.

### Technologies Used
- Java
- Spring Boot
- Microservices
- REST Api
- PostMan
- JDBC

## Eureka Server:
 - Service Registry for microservices.
 - Manages service registration and discovery.
 - Keeps track of available services.

 ## User Microservice:
  - Manages user-related functionalities. 
  - Registers with Eureka Server for service discovery.
  - Communicates with Contact Microservice.

## Contact Microservice:
- Handles operations related to contacts.
- Registers with Eureka Server for service discovery.
- Communicates with User Microservice.

## API Gateway:
- Entry point for external clients.
- Routes requests to the appropriate microservices.
- Aggregates and manages API requests.
- Directly connected to Eureka Server for service discovery.


## Communicaion Flow
- External clients interact with the API Gateway.
- The API Gateway routes requests to the corresponding microservices based on the endpoint.
- Microservices communicate with each other through Eureka Server.
- Service discovery ensures that communication is resilient to changes in microservice instances.

```bash 
External Client
    |
    |  API Gateway
    |    |
    v    v
 Eureka Server
  |      |
  v      v
User Microservice <----> Contact Microservice
```

## Key Components:

### Eureka Server:
- Base URL: http://eureka-server:8761

### User Microservice:
- Base URL: http://user-service:9001
- API Endpoints:
  - /users - User-related operations
  - ...

### Contact Microservice:
- Base URL: http://contact-service:9002
- API Endpoints:
  - /contacts - Contact-related operations
  - ...
    
### API Gateway:
- Base URL: http://api-gateway:port
- Routes:
  - /users/* - Routes to User Microservice
  - /contacts/* - Routes to Contact Microservice
  - ...
