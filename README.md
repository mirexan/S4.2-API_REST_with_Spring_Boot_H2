# S4.2-API_REST_with_Spring_Boot_H2
## Level_01
### 📄 **Description – Exercise Statement**

This project is part of a three-module series in which you will build independent Spring Boot applications, each exposing a complete CRUD REST API.  
In **Level 1**, you will create an API that manages the stock of a fruit store using an in-memory **H2 database**.

The application allows you to:

- Register fruits with name and weight in kilos.
- Retrieve one or all fruits.
- Update existing records.
- Delete fruits by their ID.

The project follows clean architecture principles, test-driven development (TDD), DTO usage, validation, and global exception handling.

---

💻 **Technologies Used**

- Java 21
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database
- Bean Validation
- Lombok (optional)
- JUnit & Mockito
- Docker (multi-stage build)

---

📋 **User Stories — Level 1 (H2 CRUD)**

1. **Register a new fruit**
	- Returns **201 Created** if valid, otherwise **400 Bad Request**.

2. **Retrieve all fruits**
	- Returns **200 OK** with an array (may be empty).

3. **Retrieve a fruit by ID**
	- Returns **200 OK** if found, **404 Not Found** if not.

4. **Update an existing fruit**
	- Returns **200 OK** if valid, **400 Bad Request** if invalid, **404 Not Found** if the ID does not exist.

5. **Delete a fruit**
	- Returns **204 No Content** if deleted, **404 Not Found** otherwise.

---

🧱 **Project Structure**
```PlainText
cat.itacademy.s04.t02.n01
├── controllers
├── model
├── services
├── repository
└── exception
```
---

🌐 **Expected Endpoints**

| Method | Endpoint     | Description     |
|--------|--------------|-----------------|
| POST   | /fruits      | Create a fruit  |
| PUT    | /fruits/{id} | Update a fruit  |
| DELETE | /fruits/{id} | Delete by ID    |
| GET    | /fruits/{id} | Get fruit by ID |
| GET    | /fruits      | Get all fruits  |

---
🧪 Testing (TDD Approach)

The application follows a TDD workflow using:

* @SpringBootTest with MockMvc or RestAssured for integration tests.

* Mockito for unit tests of services.

* Tests are written before implementing each feature.
---
🐳 **Docker Deployment**

This project includes a production-ready **multi-stage Dockerfile**:

1. **Build Stage** – Compiles the application and generates the `.jar`.
2. **Runtime Stage** – Copies the JAR into a lightweight base image.

To build the Docker image:

```BASH
docker build -t fruit-api-h2 .
``` 
To run the container:
```BASH
docker run -p 8080:8080 fruit-api-h2
```

Once the container is running, the API will be available at:

http://localhost:8080


🧰 **Testing the API with Postman (Summary)**

You can manually test the API using the following basic requests:

- **Create a fruit**  
  **POST** `"/fruits"`  
  Body example:
  ```JSON
  {
  "name": "Apple",
  "weightInKilos": 12
  }
  ```
* **Retrieve all fruits : GET** ```"/fruits"```
* **Retrieve a fruit by ID :GET** ```"/fruits/{id}"```
* **Update a fruit**
**PUT** `"/fruits/{id}"`

Body example:

```JSON
{ 
 "name": "Green Apple",
 "weightInKilos": 15 
 }
 ```
* **Delete a fruit
DELETE** `"/fruits/{id}"`