/*
The static keyword is used for a constant variable or a method that is the same for every instance of a class.
  -- Difference between static and instance variables --
    - Static variable
        - Shared by all the instances of the class.
        - Can be accessed directly using class name.
        - Only one copy exists regardless the number of instances of the class.

    -Instance Variables
        - Each instance has its own copy.
        - Can be accessed through class instance.
        - Each object will have its own copy of the instance variable.
 */
class Stud{
    public static String uniName;
    public String name;
    public int id;

    public void output(){
        System.out.println("Name : " + name + " ID : " + id + " university : " + uniName);
    }
    public static void myStaticMethod(){
        System.out.println("From static method : " + uniName);
    }

//     public static void myStaticMethod1(Student obj){
//         System.out.println("From static method : " + obj.name);
//     }
}


public class AK_40_StaticKeyword{
    public static void main(String[] args){

        Stud s1 = new Stud();
        s1.name = "Aanand";
        s1.id = 1;

        Stud s2 = new Stud();
        s2.name = "Ayush";
        s2.id = 2;

        Stud.uniName = "LPU";

        s1.output();
        s2.output();

        Stud.myStaticMethod();
    }
}


