public class Manager extends Employee {
    //department and a method to set the department
    String department;
    public Manager(int EmployeeId, String name, int age, String jobTitle, int salary) {
        super(EmployeeId, name, age, jobTitle, salary);
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}
