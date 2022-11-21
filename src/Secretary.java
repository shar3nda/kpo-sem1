public class Secretary extends Employee {
    @Override
    public String toString() {
        return String.format("Secretary %s with %d hourly salary and %d YOE, balance=%d", name, salary, YOE, balance);
    }

    public Secretary(String name, int salary, int YOE) {
        super(name, salary, YOE);
    }

    public void addYOE(Employee employee) {
        employee.YOE += 1;
    }
}
