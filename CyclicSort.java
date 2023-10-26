public class CyclicSort {
    public static void cyclicSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] != i + 1) {
                // Element arr[i] is not in its correct position.
                // Swap arr[i] with the element at arr[i] - 1.
                int correctPosition = arr[i] - 1;
                int temp = arr[i];
                arr[i] = arr[correctPosition];
                arr[correctPosition] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        System.out.println("Original Array:");
        printArray(arr);

        cyclicSort(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
