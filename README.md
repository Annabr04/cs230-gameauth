# GameAuth

Dropwizard-based REST API prototype for The Gaming Room demonstrating multi-platform expansion support through a client-server architecture with Basic Authentication and role-based authorization.

## How to start the GameAuth application

1. Run `mvn clean install` to build your application
2. Start application with `java -jar target/gameauth-0.0.1-SNAPSHOT.jar server config.yml`
3. To check that your application is running enter url `http://localhost:8080`

## Authentication

Valid demo users (all use password `password`):

- `guest` — no roles
- `user` — USER role
- `player` — no roles
- `admin` — ADMIN and USER roles

Access `http://localhost:8080/gameusers` to trigger the Basic Auth dialog. Successful login returns the list of game users as JSON.

`GET /gameusers/{id}` requires the USER role. `POST /gameusers` requires the ADMIN role.

## Health Check

To see your applications health enter url `http://localhost:8081/healthcheck`
