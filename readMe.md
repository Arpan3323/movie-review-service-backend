# Movie API

This is a Spring Boot application that provides a RESTful API for movies.

## Endpoints

The application provides the following endpoints:

- `GET /api/v1/movies`: Returns a list of all movies.
- `GET /api/v1/movies/{imdbId}`: Returns a single movie by its IMDB ID.

## Setup

1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using the command `./mvnw spring-boot:run`.

## Usage

You can access the API at `http://localhost:8080/api/v1/movies`.

## Cross-Origin Resource Sharing (CORS)

The API is configured to allow CORS requests from `http://localhost:3000`. If you're running a client application on a different URL, you'll need to update the `@CrossOrigin` annotation in `MovieController.java`.

## Dependencies

This project uses the following dependencies:

- Spring Boot
- Spring Web
- Lombok
- Spring Data MongoDB

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License

[MIT](https://choosealicense.com/licenses/mit/)