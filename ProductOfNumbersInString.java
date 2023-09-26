public class ProductOfNumbersInString {
    public static void main(String[] args) {
        String inputString = "Hello123World456";
        long product = findProductOfNumbers(inputString);
        System.out.println("Product of numbers in the string: " + product);
    }

    public static long findProductOfNumbers(String input) {
        long product = 1;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
              // Check if the current character is a digit
            if (Character.isDigit(currentChar)) {
              // If it's a digit, convert it to an integer and multiply it with the product
                int digit = Character.getNumericValue(currentChar);
                product *= digit;
            }
        }

        return product;
    }
}
