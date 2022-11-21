public class Executive extends Manager {
    public Executive(String name, int salary, int YOE) {
        super(name, salary, YOE);
    }

    @Override
    public String toString() {
        return String.format("Executive %s with %d hourly salary and %d YOE, balance=%d", name, salary, YOE, balance);
    }

    public void setSalary(Employee employee, int salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("New salary is negative!");
        }
        employee.salary = salary;
    }
}
