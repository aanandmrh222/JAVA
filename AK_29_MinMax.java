public class AK_29_MinMax {
    public static void main(String[] args) {
        int[] arr = AK_28_ArrayUtility.inputArray();

        int min = minElement(arr);
        System.out.println("Minimum element of an array is: " + min);
        int max = maxElement(arr);
        System.out.println("Maximum element of an array is: " + max);

    }

    public static int minElement(int[] array) {
        int min = array[0];
        int i=0;
        while(i<array.length) {
            if(min>array[i]) {
                min = array[i];
            }
            i++;
        }
        return min;
    }

    public static int maxElement(int[] array) {
        int max = array[0];
        int i= 0 ;
        while(i < array.length) {
            if(max < array[i]) {
                max = array[i];
            }
            i++;
        }
        return max;
    }
}
