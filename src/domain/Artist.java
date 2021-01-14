package domain;
/**
 * a class for artists that extends Empoyee
 * @see Employee
 * @author thxnk
 */
public class Artist extends Employee {
    /**
     * a constructor for this class
     * @param skiils skills of artist
     * @param name name of artist
     * @param jobTitle a title of job
     * @param level a level of employee
     * @param dept his department
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }
    
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }
    
    public Artist() {
        super();
        this.skiils = new String[10];
    }
    /**
     * a method that override method toString
     * @return string
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    private String[] skiils;
    /**
     * a method that lets us get skills
     * @return string
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
       s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * a method that setts skills
     * @param skills skills of employee
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }
    /**
     * a method that returns skills 
     * @return skills
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
