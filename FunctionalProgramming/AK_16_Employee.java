package FunctionalProgramming;

public class AK_16_Employee {
    private final String name;
    private final int salary;

    public AK_16_Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "AK_16_Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
