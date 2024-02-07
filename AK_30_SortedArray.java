public class AK_30_SortedArray {

    public static boolean sortedIncArray(int[] arr) {
        int i = 1;
        while(i<arr.length) {
            if(arr[i] < arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static boolean sortedDecArray(int[] arr) {
        int i = 1;
        while(i<arr.length) {
            if(arr[i] > arr[i-1]) {
                return false;
            }
            i++;
        }
        return true;
    }
    public static void main(String[] args) {
        int[] array = AK_28_ArrayUtility.inputArray();
        boolean isInc = sortedDecArray(array);
        boolean isDec = sortedIncArray(array);

        if(isDec || isInc) {
            System.out.println("Your array is sorted");
        }
        else {
            System.out.println("Your array is not sorted");
        }

    }
}
