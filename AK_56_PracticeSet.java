class ArrayOperations {
    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public class Statistics {
        double mean() {
            double sum = 0;
            for(int item : arr) {
                sum += item;
            }
            return sum/arr.length;
        }
        double median() {
            return 0;
        }
    }
}

public class AK_56_PracticeSet {
    public static void main(String[] args) {
        ArrayOperations array = new ArrayOperations(new int[] {1,3,5});
        ArrayOperations.Statistics stat = array.new Statistics();
        System.out.println(stat.mean());
    }
}
