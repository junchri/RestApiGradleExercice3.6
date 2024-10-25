package be.abis.exercise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiGradleExerciceApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiGradleExerciceApplication.class, args);
    }

}
// http://localhost:8080/exercise/api/swagger-ui/index.html#/course-api-controller/printCourse
// http://localhost:8080/exercise/api/courses?title=Gradle
// http://localhost:8080/exercise/api/courses
// http://localhost:8080/exercise/api/api-docs