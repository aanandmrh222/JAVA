import java.util.Objects;

class Person1 {
    private String name;
    private int age;

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person1 person1 = (Person1) o;
        return age == person1.age && Objects.equals(name, person1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class AK_55_PracticeSet {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Rohan",20);
        Person1 p2 = new Person1("Rohan",22);
        System.out.println(p1);
        System.out.println(p2);

        if(p1.equals(p2)) {
            System.out.println("Both are equals");
        }
        else {
            System.out.println("Both are not equals");
        }

    }
}
