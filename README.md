# GoTech Home Assignment

This project is a dynamic questionnaire written in Java11 as part of the home assignment given by GoTech

## How to run

1. Open a terminal
2. Clone this project

```sh
git clone <replace_this>
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
java jar
```

6. Run the mocked server with the questionnaire

```sh
yarn mock
```

Alternatively, run this application alongside its server-side project: [GoForm-Server](replace_this)

## Notable libraries used

- [React-router](https://github.com/remix-run/react-router) for managing the routing and easier parsing of the route parameters
- [AntD](https://github.com/ant-design/ant-design) as the CSS Framework to build this application
- [Axios](https://github.com/axios/axios) as the HTTP client to consume our questionnaire backend

## Environment variables

All environment variables can be configured within the .env file

| Variable          | Description                               | Default Value         |
| ----------------- | ----------------------------------------- | --------------------- |
| REACT_APP_API_URL | Complete URL of the Questionnaire backend | http://localhost:8080 |
