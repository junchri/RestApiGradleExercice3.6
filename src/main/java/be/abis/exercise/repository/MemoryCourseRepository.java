package be.abis.exercise.repository;

import be.abis.exercise.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MemoryCourseRepository implements CourseRepository {
	
	private ArrayList<Course> courses = new ArrayList<Course>();

	public MemoryCourseRepository(){
		courses.add(new Course(7850,"DB2, an overview","DB2, an overview",5,550.0));
		courses.add(new Course(7900,"Workshop SQL","Workshop SQL",3,475.0));
		courses.add(new Course(8000,"JavaProg","Java Programming",5,500.0));
		courses.add(new Course(8050,"Gradle","Gradle",1,450.0));
		courses.add(new Course(8100,"Spring","Programming with Spring",3,525.0));
	}

	public ArrayList<Course> getCourses() {
		return courses;
	}

	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	@Override
	public List<Course> findAllCourses() {
		return courses;
	}

	@Override
	public Course findCourseById(int id) {
		return courses.stream().filter(c->c.getCourseId() == id).findFirst().orElse(null);
	}

	@Override
	public Course findCourseByShortTitle(String shortTitle) {
		return courses.stream().filter(c->c.getShortTitle().equals(shortTitle)).findFirst().orElse(null);
	}

	@Override
	public void addCourse(Course c) {
		courses.add(c);
	}

	@Override
	public void updateCourse(Course c) {
		//courses.add(c);
	}

	@Override
	public void deleteCourse(int id) {
		//
		// courses.deleteCourse(id);
	}
}
