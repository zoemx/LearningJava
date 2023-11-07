public class SalesPerson extends Employee {
    //department and a method to set the department
    int salesTarget;
    public SalesPerson(int employeeId, String name, int age, String jobTitle, int salary, String department) {
        super(employeeId, name, age, jobTitle, salary);
    }
    public void setSalesTarget(String department) {
        this.salesTarget = salesTarget;
    }
}