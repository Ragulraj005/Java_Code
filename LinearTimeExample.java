//linear time 0(n) = Big o 
public class LinearTimeExample {

  public static void main(String[] args) {
    int[] numbers = { 3, 7, 1, 9, 4, 5 };

    // Find and print the maximum element in the array
    int maxElement = findMax(numbers);

    System.out.println("The maximum element is: " + maxElement);
  }

  public static int findMax(int[] array) {
    if (array.length == 0) {
      throw new IllegalArgumentException("Array is empty");
    }

    int max = array[0]; // Assume the first element is the maximum

    // Iterate through the array to find the maximum element
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }

    return max;
  }
}
