package FunctionalProgramming;

public class AK_01_LambdaExpression {
    public static void main(String[] args) {
        AK_01_LambdaExpression test = new AK_01_LambdaExpression();
        int sum = test.sum(6,7);
        System.out.println(sum);
        test.printString("Hello");

        // toPrint -> System.out.println(toPrint);
        // (a, b) -> a + b;
        // (a, b) -> {
        //      int sum = a + b;
        //      System.out.println(sum);
        // }
        
    }

    public void printString(String toPrint) {
        System.out.println(toPrint);
    }
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
