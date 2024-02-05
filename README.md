# Microservices Architecture:

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
