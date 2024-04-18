public class AK_36_ToString {
    String name;
    int age;
    int rollNumber;

    public AK_36_ToString(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Student Details:{name: "+name+", age: "+age+", rollNumber: "+rollNumber+"}";
    }
    public static void main(String[] args) {
        AK_36_ToString stu = new AK_36_ToString("Aanand",18,36);
        System.out.println(stu.toString());
        System.out.println(stu);

        String firstName = "Aanand";
        String lastName = "Kumar";
//        String fullName = firstName + " " + lastName;
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());

        System.out.println("\n-- Words concatenate using StringBuilder --");
        String[] arr = new String[] {
                "My","Name","is","Aanand", "Kumar"
        };
        StringBuilder sb = new StringBuilder();
        for(String str1 : arr) {
            sb.append(str1).append(" ");
        }
        System.out.println(sb);

    }
}
