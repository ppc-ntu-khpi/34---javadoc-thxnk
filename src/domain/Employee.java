package domain;

/**
 * a common class for every empoyee
 * @author thxnk
 */
public class Employee {

    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }
    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    /**
     * a constroctor for class
     * @param name a name of empoyee
     * @param jobTitle a name of job
     * @param level employe's level
     * @param dept a depatrment, in which man works
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    /**
     * this method sets jobTitle 
     * @param job a parameter that represents jobTitle
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * this method lets us get a jobTitle  
     * @return a value jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * this method lets us get a name of empoyee  
     * @return a value of name
     */
    public String getName() {
        return name;
    }
    /**
     * a setter that sets a level
     * @param level level of empoyee that we want to set
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * this method lets us get a level of empoyee 
     * @return a value level of empoyee
     */
    public int getLevel() {
        return level;
    }
    /**
     * this method lets us get a department of empoyee 
     * @return a value of department of empoyee 
     */
    public String getDept() {
        return dept;
    }
    /**
     * a setter that sets a department
     * @param dept department of empoyee
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     * a setter that sets a name
     * @param name name of employee 
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
