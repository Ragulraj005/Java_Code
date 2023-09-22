//QuadraticTime 0(n^2) = Big 0

public class QuadraticTimeExample {

  public static void main(String[] args) {
    int[] numbers = { 5, 2, 1, 6, 3, 4 };

    // Use a quadratic time algorithm to perform a simple sorting (selection sort)
    selectionSort(numbers);

    // Print the sorted array
    for (int num : numbers) {
      System.out.print(num + " ");
    }
  }

  public static void selectionSort(int[] array) {
    int n = array.length;

    for (int i = 0; i < n - 1; i++) {
      int minIndex = i;

      // Find the index of the minimum element in the unsorted portion of the array
      for (int j = i + 1; j < n; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      // Swap the found minimum element with the first element
      int temp = array[minIndex];
      array[minIndex] = array[i];
      array[i] = temp;
    }
  }
}
