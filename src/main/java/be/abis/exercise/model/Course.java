package be.abis.exercise.model;

import org.apache.commons.lang3.StringUtils;

public class Course {

    private String courseId;
    private String shortTitle;
    private String longTitle;
    private int numberOfDays;
    private double pricePerDay;

    public Course(){}

    public Course(String courseId, String shortTitle, String longTitle, int numberOfDays, double pricePerDay) {
        super();
        this.courseId = courseId;
        this.shortTitle = shortTitle;
        this.longTitle = longTitle;
        this.numberOfDays = numberOfDays;
        this.pricePerDay = pricePerDay;
    }

    public String getCourseId() {
        return courseId;
    }
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }
    public String getShortTitle() {
        return shortTitle;
    }
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }
    public String getLongTitle() {
        return longTitle;
    }
    public void setLongTitle(String longTitle) {
        this.longTitle = longTitle;
    }
    public int getNumberOfDays() {
        return numberOfDays;
    }
    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }
    public double getPricePerDay() {
        return pricePerDay;
    }
    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public String toString(){
        return	"The " + StringUtils.lowerCase(this.longTitle) + " course takes " + numberOfDays + " days and costs " + pricePerDay + " per day.";
    }


}