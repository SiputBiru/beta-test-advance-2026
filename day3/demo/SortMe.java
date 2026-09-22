import java.util.Arrays;

public class SortMe {	

	// TODO: Implement sorting algorithm
	public static void sort(int[] data) {
		boolean is_swapped;

		for (int i = 0; i < data.length-1; i++) {
			is_swapped = false;

			for (int j = 0; j < data.length-(i+1); j++) {	
				Chart.render(data, j, "Current", 100);
				
				if (data[j] > data[j+1]) {
					is_swapped = true;

					int tmp = data[j+1];
					data[j+1] = data[j];
					data[j] = tmp;

					Chart.render(data, j+1, "SWAP!", 100);
				}
			}
			if (!is_swapped) break;
		}
	}

	public static void main(String[] args) {
		int[] numbers = {42, 7, 89, 15, 63, 28, 94, 3, 51, 76, 12, 35, 68, 81, 24, 90, 5, 47, 62, 19};

		// System.out.println(numbers.length);
		
		
		Chart.render(numbers, 100);
		
		// // TODO: Sort Me!
		sort(numbers);
		// // Arrays.sort(numbers);

		// Chart.render(numbers, 100);
	}
}
