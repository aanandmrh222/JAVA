public class AK_32_PracticeSet {
    public static void reverseArray(int[] array) {
//        int i = 0;
//        while(i< array.length/2) {
//            int swap = array[i];
//            array[i] = array[(array.length - 1) - i];
//            array[(array.length - 1) - i] = swap;
//            i++;
//        }

        // Here you can also do using loop but loop create new array and above method does not create any new array
        int j = array.length - 1;
        while(j >= 0) {
            System.out.print(array[j] + "  ");
            j--;
        }

    }

    public static boolean palindrome(int[] arr) {
        int i = 0;
        while(i<arr.length/2) {
            if(arr[i]==arr[(arr.length -1) - i]){
                return true;
            }
            i++;
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(" -- Reverse array -- ");
        int[] array = AK_28_ArrayUtility.inputArray();
//        // Here is first one method call
//        System.out.println("Original array");
//        AK_28_ArrayUtility.arrayPrint(array);
//        System.out.println("Reverse array");
//        reverseArray(array);
//        AK_28_ArrayUtility.arrayPrint(array);

        // Here is the another method call, i.e. using loop
        System.out.println("Original array");
        AK_28_ArrayUtility.arrayPrint(array);
        System.out.println("Reverse array");
        reverseArray(array);
        System.out.println();

        System.out.println(" -- Palindrome -- ");
        boolean isPalindrome = palindrome(array);
        if(isPalindrome) {
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("This is not Palindrome");
        }

    }
}
