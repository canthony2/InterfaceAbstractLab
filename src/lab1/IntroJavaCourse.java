package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends TechClass{
    
    @Override
    public String getCourseName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double getCredits() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCourseNumber() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String getPrerequisites() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setCourseName(String CourseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    
    @Override
    public void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.setCourseNumber() = courseNumber;
    }
    
    @Override
    public void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    @Override
    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }
    
    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

}
