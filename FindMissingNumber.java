public class FindMissingNumber {
  public static void main(String[] args) {
    int[] seq = { 1, 2, 4 };

    int sum = 0; // Initialize the sum variable
    for (int num : seq) {
      sum += num;
    }

    int n = seq.length+1; 
    int expectedSum = n * (n + 1) / 2;
    int missingNumber = expectedSum - sum;

    System.out.println("The missing number is: " + missingNumber);
  }
}
