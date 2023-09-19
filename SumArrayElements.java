public class SumArrayElements {
    public static void main(String[] args) {
        int[] arr = {6, 5, 6, 7, 5, 8, 3, 9, 3};

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
