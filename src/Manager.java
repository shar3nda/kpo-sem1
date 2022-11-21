public class Manager extends Employee {
    @Override
    public String toString() {
        return String.format("Programmer %s with %d hourly salary and %d YOE, balance=%d", name, salary, YOE, balance);
    }

    public Manager(String name, int salary, int YOE) {
        super(name, salary, YOE);
    }

    public void raiseSalary(Employee employee, int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary bonus is negative!");
        }
        employee.salary += salary;
    }
}
