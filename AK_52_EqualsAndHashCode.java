import java.util.Objects;

class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

//    @Override
//    public boolean equals(Object obj) {
////  instanceof operator is used to test whether the object is an instance of the specified class.
//        if(!(obj instanceof Person)) {
//            return false;
//        }
//        Person per = (Person) obj;
//        return per.name.equals(name) && per.age==age && per.id.equals(id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, id);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, id);
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id='" + id + '\'' +
                '}';
    }
}


public class AK_52_EqualsAndHashCode {
    public static void main(String[] args) {
        Person person1 = new Person("Rohan", 18, "001");
        Person person2 = new Person("Rohan", 18, "001");

//        if(person1==person2) {
        if(person1.equals(person2)) {
            System.out.println("Both are equal");
        }
        else {
            System.out.println("Both are not equal");
        }

        System.out.println(person1);
    }
}
