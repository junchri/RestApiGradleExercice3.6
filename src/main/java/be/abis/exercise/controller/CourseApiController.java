package be.abis.exercise.controller;

import be.abis.exercise.model.Course;
import be.abis.exercise.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseApiController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public Course findCourse(@RequestParam("title") String shortTitle) {
        Course course = courseService.findCourseByShortTitle(shortTitle);
        return course;
    }
}
