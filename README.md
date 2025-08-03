# 💰 Expense Tracker

A simple Expense Tracking backend application built with **Spring Boot** and **PostgreSQL**.  
The project demonstrates secure user registration, validation, password encryption, and database integration via Docker.

## ✨ Features

- 🛡️ User Registration with input validation
- 🔐 Secure password hashing (BCrypt)
- 🗃️ PostgreSQL database via Docker Compose
- 🧱 Spring Boot and Spring Data JPA
- 📦 Project structured with DTO, Service, Controller, Repository layers
- 🔄 Ready for JWT Authentication extension
- 📫 Tested via Postman

## 🛠️ Tech Stack

- Java **21**
- Spring Boot 3
- Spring Security
- Jakarta Validation
- Lombok
- PostgreSQL (Docker)
- Maven

## 🚀 Getting Started

### Prerequisites

- Java 21+
- Maven
- Docker & Docker Compose
- Postman (optional for testing)

### Clone & Run

```bash
git clone https://github.com/yourusername/expense-tracker.git
cd expense-tracker
```

1. Start the PostgreSQL container:

```bash
docker-compose up -d
```

2. Run the Spring Boot app:

```bash
./mvnw spring-boot:run
```

The API will be available at: `http://localhost:8080/api/auth/register`

### Example Registration JSON

```json
{
  "username": "sergey",
  "email": "sergey@example.com",
  "password": "qwerty123"
}
```

## 📦 Folder Structure

```
src
├── controller
├── dto
├── model
├── repository
├── service
└── config (if using Spring Security)
```

## 🧩 To Do

- [ ] Add Login endpoint
- [ ] Implement JWT authentication
- [ ] Add expense CRUD endpoints
- [ ] Add unit & integration tests
- [ ] Frontend with React (PWA ready)

