import java.util.Arrays;

public class SearchMe {

	// TODO: Implement searching algorithm
	public static void sort(int[] data) {
		return;
	}
	public static void main(String[] args) {
		int[] numbers = {12, 28, 45, 67, 89};
		
		Chart.render(numbers, 100);
		
		// TODO: Search Me!
		int index = Arrays.binarySearch(numbers, 45);	
		
		Chart.render(numbers, index, "Found!", 100);

		System.out.println("\nItem berada di index ke-"+ index);
	}
}
