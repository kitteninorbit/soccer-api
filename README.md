# JogoDelas Backend

This is the official backend repository for the JogoDelas full-stack soccer application, providing a RESTful API built with Spring Boot to manage competitions, teams, matches, and broadcasts. It is fully configured with global CORS support for frontend integration and containerized for deployment on Render.

## Tech Stack

- **Framework:** Java 25 with Spring Boot 4.1.1
- **Database:** PostgreSQL managed via Spring Data JPA
- **Deployment:** Render Web Service using a multi-stage Docker environment

## Local Setup & Installation

1. Clone the repository and verify that Java 25 and Maven are installed on your local machine.
2. Start a local PostgreSQL instance and create a blank database (e.g., `jogodelas_db`).
3. Run the provided SQL seed script via your preferred database tool (like pgAdmin) to populate the initial database schema and records.
4. Execute `./mvnw spring-boot:run` in your terminal to compile and start the server locally on port `8080`.

## Environment Variables

- `DB_URL`: The full JDBC connection string (e.g., `jdbc:postgresql://localhost:5432/jogodelas_db`)
- `DB_USER`: The username for your PostgreSQL database
- `DB_PASSWORD`: The password for your PostgreSQL database

## Core API Endpoints

- `GET /api/competitions`: Returns the active tournaments, including the Libertadores and Baianão.
- `GET /api/teams`: Fetches the 29 registered teams, including their names, logos, and Instagram URLs.
- `GET /api/matches`: Retrieves the 32 scheduled matches, including stage, stadium, and datetime data.
- `GET /api/broadcasts`: Provides the 16 available free and paid streaming links tied to specific match IDs.
