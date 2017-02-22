/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author canthony2
 */
public abstract class TechClass {
    
    private String courseName;
    private String courseNumber;
    private double credits;

    public final String getCourseName() {
        return courseName;
    }

    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            throw new IllegalArgumentException("please enter valid Course Name");
        }
        this.courseName = courseName;
    }

    public final String getCourseNumber() {
        return courseNumber;
    }

    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() < 0 || courseNumber.length() > 7) {
            throw new IllegalArgumentException("please enter valid Course Number in XXX-XXX format");
        }
        this.courseNumber = courseNumber;
    }

    public final double getCredits() {
        return credits;
    }

    public final void setCredits(double credits) {
        if(credits < 0 || credits > 4) {
            throw new IllegalArgumentException("please enter valid credit amount");
        }
        this.credits = credits;
    }

}
