/*
The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
 - declare class variables/attributes as private
 - provide public get and set methods to access and update the value of a private variable
 */

class Example6 {
    private String name;
    private int age;

    // Getter Methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    // Setter Methods
    public void setName(String newName) {
        this.name = newName;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
}
public class AK_46_Encapsulation {
    public static void main(String[] args) {
        Example6 ex6 = new Example6();
        ex6.setName("Rohan");
        ex6.setAge(18);
        System.out.println("Name: " + ex6.getName());
        System.out.println("Age: " + ex6.getAge());
    }
}
