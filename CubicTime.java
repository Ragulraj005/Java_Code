// Cubic Time 0(n^3) = Big 0
public class CubicTimeExample {

    public static void main(String[] args) {
        int n = 5;
        
        // Perform a cubic time operation: generating all possible triplets
        generateTriplets(n);
    }

    public static void generateTriplets(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    System.out.println("(" + i + ", " + j + ", " + k + ")");
                }
            }
        }
    }
}
