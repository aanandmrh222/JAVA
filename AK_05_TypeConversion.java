public class AK_05_TypeConversion {
    public static void main(String[] args) {
        float myFloat = 5;
        System.out.println(myFloat);

//        int myInt = 5.0f;        // error
        int myInt = (int) 5.0f;
        System.out.println(myInt);

        int i = (int) 5.6F;
        System.out.println(i);

        float f = (float) 5;
        System.out.println(f);
    }
}
