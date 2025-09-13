Task Management System - Microservices Architecture
Project Overview
A training project for an advanced software engineering course focused on building a comprehensive task management system using microservices architecture with Spring Boot.

Technology Stack
Java Spring Boot - Main application framework

Microservices Architecture - Distributed system design

Spring Cloud - Service coordination and management

Git & GitHub - Version control

Database - MySQL

Message Broker - RabbitMQ/Kafka (to be implemented)

Project Structure
TaskManagerMicroservices/
│
├── auth-service/                 # Authentication & user management
│   ├── src/main/java/
│   │   ├── com/auth/            # Main application class
│   │   ├── model/               # User model
│   │   ├── repository/          # Data access layer
│   │   ├── service/             # Business logic
│   │   └── controller/          # REST endpoints
│   └── src/main/resources/
│       └── application.yml      # Service configuration
│
├── task-service/                 # Task management functionality
├── notification-service/         # Notification system
├── api-gateway/                  # API Gateway for routing
├── service-discovery/            # Eureka discovery server
├── config-server/                # Centralized configuration

Getting Started
Prerequisites
Java JDK 17 or higher

Maven or Gradle

Docker (optional)

Git

Installation & Setup
1) Clone the repository:
  git clone https://github.com/Mosab-Sabbagh/Task-Management-System-Microservices.git
2)Navigate to the project directory:
  cd Task-Management-System-Microservices
3)Build the services:
  # Using Maven
  mvn clean install
  
  # Or using Gradle
  ./gradlew build

Available Services
Auth Service (Port 8081): User registration, authentication, and authorization

Task Service (Port 8082): CRUD operations for tasks and assignments

Notification Service (Port 8083): Email and in-app notifications

API Gateway (Port 8080): Unified entry point for all services

Service Discovery (Port 8761): Eureka server for service registration

Development Roadmap
Project setup and basic structure

Auth service implementation

Task service implementation

Notification service implementation

API Gateway configuration

Service discovery setup

Database integration

Security implementation (JWT)

Docker containerization

CI/CD pipeline

Contributing
Fork the repository

Create a feature branch: git checkout -b feature/amazing-feature

Commit changes: git commit -m 'Add amazing feature'

Push to branch: git push origin feature/amazing-feature

Open a pull request

License
This project is licensed under the MIT License - see the LICENSE file for details.

Contact
Mosab Sabbagh - GitHub

Acknowledgments
Advanced Software Engineering course materials

Spring Boot and Spring Cloud documentation

Microservices architecture patterns

