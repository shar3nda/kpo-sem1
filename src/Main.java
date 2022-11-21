public class Main {
    public static void main(String[] args) {
        Programmer[] programmerArray = new Programmer[]{
                new Programmer("Stefan", 200, 5),
                new Programmer("Zach", 150, 3),
                new Programmer("Andy", 100, 2)
        };
        Manager mgr = new Manager("Richard", 120, 4);
        Secretary scr = new Secretary("Johann", 130, 1);
        Executive exec = new Executive("Elon", 1000, 10);

        for (Programmer programmer : programmerArray) {
            System.out.println(programmer);
            System.out.println("Working...");
            programmer.doWork();
            System.out.println(programmer);
        }
        programmerArray[1].complain();
        programmerArray[0].breakProduction();
        System.out.printf("%s just broke production!%n", programmerArray[0]);
        System.out.printf("%s raised salary of %s by %d%n", mgr, programmerArray[2], 50);
        mgr.raiseSalary(programmerArray[2], 50);
        System.out.println("Working...");
        programmerArray[2].doWork();
        System.out.println(programmerArray[2]);
        System.out.printf("%s raised YOE of %s%n", scr, programmerArray[0]);
        scr.addYOE(programmerArray[0]);
        System.out.println("Working...");
        programmerArray[0].doWork();
        System.out.println(programmerArray[0]);
        System.out.printf("%s sets salary of %s to %d%n", exec, programmerArray[1], -1);
        exec.setSalary(programmerArray[1], -1);
    }
}


