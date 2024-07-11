package FunctionalProgramming;
import java.util.Comparator;
import java.util.List;

public class AK_16_TestingSorting {
    public static void main(String[] args) {
        List<AK_16_Employee> employees = List.of(
                new AK_16_Employee("Mohan", 6000),
                new AK_16_Employee("Rohan", 9000),
                new AK_16_Employee("Sohan", 5000),
                new AK_16_Employee("Mohit", 8000),
                new AK_16_Employee("Hari", 7000)
        );

        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);

    }
}
