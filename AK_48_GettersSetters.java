class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public int getId() {
        return id;
    }
    public void setId(int i) {
        this.id = i;
    }

}
public class AK_48_GettersSetters {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();
//        emp.id = 05;   // Throws an error due to private access modifier
//        emp.name = "Rohan";
        emp.setName("Rohan");
        System.out.println(emp.getName());
        emp.setId(05);
        System.out.println(emp.getId());
    }
}
