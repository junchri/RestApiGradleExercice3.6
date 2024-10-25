package be.abis.exercise.repository;

import be.abis.exercise.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository

    public class DataBaseCourseRepository implements CourseRepository {

        @Autowired
        JdbcTemplate jdbcTemplate;

        @Override
        public List<Course> findAllCourses() {
            return jdbcTemplate.query("select * from abiscourses", new CourseMapper());
        }

        @Override
        public Course findCourseById(int id) {
            return null;
        }

        @Override
        public Course findCourseByShortTitle(String shortTitle) {
            return null;
        }

        @Override
        public void addCourse(Course c) {

        }

        @Override
        public void updateCourse(Course c) {

        }

        @Override
        public void deleteCourse(int id) {

        }

        public static final class CourseMapper implements RowMapper<Course> {
            public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
                Course course = new Course();
                course.setCourseId(rs.getString("CID"));
                course.setLongTitle(rs.getString("CLTITLE"));
                course.setShortTitle(rs.getString("CSTITLE"));
                course.setPricePerDay(rs.getDouble("CAPRICE"));
                course.setNumberOfDays(rs.getInt("CDUR"));
                return course;
            }

        }
    }

