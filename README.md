# GoTech Home Assignment

This project is a dynamic questionnaire written in Java 11 as part of the home assignment given by GoTech

## How to run

1. Open a terminal
2. Clone this project

```sh
git@github.com:EricMoIr/goform-server.git
```

3. Position yourself inside the folder of this project

```sh
cd goform-server
```

4. Build the application

```sh
mvn install
```

5. Run the application

```sh
java -jar target/goform-server-1.0.0.jar
```

## Notable libraries used

- [Spring Boot](https://spring.io/guides/gs/spring-boot/) for setting up the web server and managed dependency injection
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) for managing the connection against the database, including the automatic creation of queries and models
- [H2 Database Engine](https://www.h2database.com/html/main.html) to set up an in-memory database to store our models

## Environment variables

All environment variables can be configured within the src/main/resources/application.properties file

| Variable                                   | Description                                  | Default Value                   |
| ------------------------------------------ | -------------------------------------------- | ------------------------------- |
| spring.datasource.url                      | Connection string to connect to the database | jdbc:h2:mem:goform              |
| spring.datasource.driverClassName          | Driver used to connect to the database       | org.h2.Driver                   |
| spring.datasource.username                 | Username to connect to said database         | sa                              |
| spring.datasource.password                 | Password to connect to said database         |                                 |
| spring.jpa.database-platform               | Platform of the database used                | org.hibernate.dialect.H2Dialect |
| spring.jpa.defer-datasource-initialization | Flag used to initialize the seed data        | true                            |
