 
public class BubbleSort {
	public static void main(String[] args) {
		int arr1[] = { 2, 4, 3, 9, 5, 14, 11, 1, 20 };
		bubblesort(arr1);
		for (int i : arr1) {
			System.out.println(i);
		}
	}

	private static void bubblesort(int[] arr1) {
		int temp = arr1[0];
		for(int i =0; i<arr1.length-1;i++) {
			for(int j=0;j<arr1.length-i-1;j++) {
				if(arr1[j]>arr1[j+1]) {
					temp = arr1[j];
					arr1[j] = arr1[j+1];
					arr1[j+1] = temp;
				}
				
			}
		}
		
		
	}

}
