public class TwoPointerExample {
    public static boolean findPairWithSum(int[] arr, int target) {
        int left = 0;           // Initialize the left pointer to the start of the array
        int right = arr.length - 1;  // Initialize the right pointer to the end of the array

        while (left < right) {
            int currentSum = arr[left] + arr[right];  // Calculate the sum of elements at left and right pointers

            if (currentSum == target) {
                System.out.println("Pair found: " + arr[left] + ", " + arr[right]);
                return true;  // Pair with the target sum found
            } else if (currentSum < target) {
                left++;  // Move the left pointer to the right
            } else {
                right--;  // Move the right pointer to the left
            }
        }

        System.out.println("Pair not found");
        return false;  // Pair with the target sum not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int targetSum = 16;
        findPairWithSum(arr, targetSum);
    }
}
