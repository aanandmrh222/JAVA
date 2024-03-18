class MyEmp {
    private String name;
    private int age;
    private double salary;

    MyEmp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    String getEmployeeDetails() {
        return "EmployeeDetails: Name:"+name+", Age:"+age+", Salary:"+ salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class AK_50_PracticeSet {
    public static void main(String[] args) {
        MyEmp emp = new MyEmp("Rohan",18,50000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());

    }
}
