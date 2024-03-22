public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                count++;
            }
            i += 2; // Move to next available plot (skipping one)
        }
        return count >= n;
    }

    public static void main(String[] args) {
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Can place " + n1 + " flowers in flowerbed1? " + canPlaceFlowers(flowerbed1, n1));

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("Can place " + n2 + " flowers in flowerbed2? " + canPlaceFlowers(flowerbed2, n2));
    }
}
