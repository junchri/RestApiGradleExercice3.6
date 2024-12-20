package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.service.CourseService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CourseServiceTest {

        @Autowired
        CourseService courseService;

        @Test
        public void findById() {
            Course c = courseService.findCourseById(7850);
            assertEquals("DB2, AN OVERVIEW",c.getShortTitle().toUpperCase());
        }


}

