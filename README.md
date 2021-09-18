# Interview Project

This is a very simple Spring Boot Service, representing a simple user management system.

## Tasks:
* Finish implementation of:
    * Get by Username
    * Create User
    * Authenticate User
* Make sure your code is tested
* Demonstrate using an external tool (such as Postman) to invoke your API

* Further instructions are found with a "TODO" comment at those endpoints.
* A simple JpaRepository has been provided, along with data models.

## Running Spring Boot:

*  `./gradlew bootRun`
* Use your favorite IDE and run the `InterviewApplication`

## Endpoints:

### Get by Username

```
GET /api/users/user1 HTTP/1.1
Host: localhost:8080
```
Expected return:
```
200 OK
{
    "username": "user1",
    "firstName": "John",
    "lastName": "Last"
}

or 404 Not Found
```

### Create User

```
POST /api/users HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 104

{
    "username": "username",
    "firstName": "first",
    "lastName": "last",
    "password": "pass"
}
```
Expected return:
```
201 Created
{
    "username": "username",
    "firstName": "first",
    "lastName": "last"
}

or 409 Conflict if username already exists
```

### Authenticate User

```
POST /api/authenticate HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 54

{
    "username": "username",
    "password": "pass"
}
```
Expected Return:
```
200 (if authenticated ok)
401 (if wrong password supplied)
```

## H2 Database
An H2 database has been configured.

It has been auto-populated with a simple user table and pre-seeded with data.

```
CREATE TABLE users (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(250) NOT NULL,
  firstname VARCHAR(250) NOT NULL,
  lastname VARCHAR(250) NOT NULL,
  password VARCHAR(250) NOT NULL
);
```

Once your service has been started, the H2 console can be connected to:

http://localhost:8080/h2-console
- Username: sa
- Password: <blank>
- JDBC URL: jdbc:h2:mem:bootapp;DB_CLOSE_DELAY=-1
