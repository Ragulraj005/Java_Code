public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high && x >= arr[low] && x <= arr[high]) {
            int probePosition = low + ((x - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if (arr[probePosition] == x) {
                return probePosition;
            }

            if (arr[probePosition] < x) {
                low = probePosition + 1;
            } else {
                high = probePosition - 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        int x = 30;
        int result = interpolationSearch(arr, x);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
