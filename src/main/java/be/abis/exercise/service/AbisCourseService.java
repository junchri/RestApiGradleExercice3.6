package be.abis.exercise.service;

import be.abis.exercise.model.Course;
import be.abis.exercise.repository.CourseRepository;
import be.abis.exercise.repository.MemoryCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AbisCourseService implements CourseService {
    @Autowired
    private CourseRepository cr;



    public List<Course> findAllCourses() {
        return cr.findAllCourses();
    }

    public Course findCourseById(int ind) {
        return cr.findCourseById(ind);
    }

    public Course findCourseByShortTitle(String shortTitle) {
        return cr.findCourseByShortTitle(shortTitle);
    }

    public void addCourse(Course c){

    }
    public void updateCourse(Course c) {

    }
    public void deleteCourse(int id) {

    }

}
