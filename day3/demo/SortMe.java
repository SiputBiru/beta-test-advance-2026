import java.util.Arrays;

public class SortMe {	

	// TODO: Implement sorting algorithm
	public static void sort(int[] data) {
		return;
	}

	public static void main(String[] args) {
		int[] numbers = {42, 7, 89, 15, 63, 28, 94, 3, 51, 76, 12, 35, 68, 81, 24, 90, 5, 47, 62, 19};
		
		Chart.render(numbers, 100);
		
		// TODO: Sort Me!
		Arrays.sort(numbers);

		Chart.render(numbers, 100);
	}
}
