public class Programmer extends Employee {
    @Override
    public String toString() {
        return String.format("Programmer %s with %d hourly salary and %d YOE, balance=%d", name, salary, YOE, balance);
    }

    public Programmer(String name, int salary, int YOE) {
        super(name, salary, YOE);
    }

    public void complain() {
        System.out.printf("%s says: \"My coffee is too cold! This workplace sucks!\"%n", name);
    }

    public void breakProduction() {
        balance -= 1000;
        if (balance < 0) {
            balance = 0;
        }
    }
}
