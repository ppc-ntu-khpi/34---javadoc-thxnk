package domain;
/**
 * a class that extends Employee
 * @see Employee
 * @author thxnk
 */
public class Manager extends Employee {
    /**
     * a constructor for a class 
     * @param employees employees
     * @param name a name of manager
     * @param jobTitle a job title
     * @param level a level of manager
     * @param dept manager's department
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    @Override
    /**
     * a method that override method toString
     * @return string
     */
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }
    /**
     * another constructor
     * @param employees 
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**
     * another constructor
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    /**
     * a method that lets us get emplyees
     * @return 
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * a method that sets employees list
     * @param employees 
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * a method that lets us get employee list
     * @return 
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
