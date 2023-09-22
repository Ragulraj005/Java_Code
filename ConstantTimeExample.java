public class ConstantTimeExample {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };
        
        // Get the first element of the array
        int firstElement = getFirstElement(numbers);
        
        // Print the result
        System.out.println("The first element is: " + firstElement);
    }

    public static int getFirstElement(int[] array) {
        if (array.length > 0) {
            return array[0]; // Return the first element of the array
        } else {
            throw new IllegalArgumentException("Array is empty");
        }
    }
}
