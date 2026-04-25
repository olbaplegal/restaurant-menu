# Restaurant Menu

This project is a restaurant menu management system, consisting of a backend built with Java Spring, a frontend using TypeScript/CSS/HTML, and a PostgreSQL database.

<div align="center">
  <img width="300" alt="home_page" src="https://github.com/user-attachments/assets/44fa4fd0-dc42-4100-a60b-786e7361f4c6" />
  <img width="300" alt="modal" src="https://github.com/user-attachments/assets/d78dac31-50c7-4f73-b7fa-9da1cdcfddfb" />
</div>

## Requirements

Before starting, make sure you have the following installed on your machine:

- Java JDK 17+
- Node.js and NPM (to manage frontend dependencies)
- Git

## Cloning the Project

First, clone the project to your machine:
```
git clone [https://github.com/olbaplegal/restaurant-menu.git](https://github.com/olbaplegal/restaurant-menu.git)
cd restaurant-menu
```

## Backend
```
cd backend
```

Spring Boot already includes a Maven Wrapper, so dependencies will be downloaded automatically on the first run:
```
# Linux/Mac

./mvnw spring-boot:run

# Windows

mvnw.cmd spring-boot:run
```

Wait for the dependencies to download (this happens only the first time). The backend will start on port 8080.

## Frontend

Open a new terminal and navigate to the frontend folder:
```
cd frontend
```

Install Node.js dependencies:
```
npm install
```

After installation, run the project:
```
npm run dev
```

## Database

Edit the file backend/src/main/resources/application.properties with your database information:
```
spring.datasource.url=your_database_url
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
```

Run the following SQL query to create and structure the database:
```
create database food;

create table foods(
id bigserial primary key,
title varchar(255),
price int,
image varchar(500)
);
```
