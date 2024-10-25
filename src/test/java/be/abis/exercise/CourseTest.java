package be.abis.exercise;

import be.abis.exercise.model.Course;
import be.abis.exercise.utility.MyUtility;

public class CourseTest {
    public static void main(String[] args) {
        Course c = new Course("1", "REST API", "REST API with java and gradle", 5, 500);
        System.out.println("The "+c.getShortTitle()+" course takes "+c.getNumberOfDays()+" days and costs "+c.getPricePerDay()+" per day");
        MyUtility.printCourse(c);
    }
}
