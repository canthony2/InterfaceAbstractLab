package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author      your name goes here
 * @version     1.00
 */
public class IntroJavaCourse extends TechClass{
    
    private String prerequisites;
    
    public IntroJavaCourse() {
        
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if(prerequisites == null || prerequisites.length() == 0) {
            throw new IllegalArgumentException("please enter valid prerequisite");
        }
        this.prerequisites = prerequisites;
    }
    
}
