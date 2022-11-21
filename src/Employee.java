public abstract class Employee {
    protected String name;
    protected int salary;
    protected int balance;
    protected int YOE;

    @Override
    public abstract String toString();

    public final int getSalary() {
        return salary;
    }

    public final void doWork() {
        balance += salary + YOE;
    }

    public Employee(String name, int salary, int YOE) {
        this.name = name;
        this.salary = salary;
        this.YOE = YOE;
        this.balance = 0;
    }
}
