import java.util.Arrays;

public class SearchMe {

	// TODO: Implement searching algorithm
	public static void sort(int[] data) {
		int target = data[0];
		int i = 1;
		
		while (i < data.length) {
			Chart.render(data, i, "Current", 100);
			if (target < data[i]) {
				target = data[i];
			}
			i++;
		}

		System.out.println("Data terbesar adalah " + target);
	}
	public static void main(String[] args) {
		// int[] numbers = {12, 28, 45, 67, 89};
		int[] numbers = {42, 7, 89, 15, 63, 28, 94, 3, 51, 76, 12, 35, 68, 81, 24, 90, 5, 47, 62, 19};
		
		Chart.render(numbers, 100);
		
		// TODO: Search Me!
		sort(numbers);

		// System.out.println("\nItem berada di index ke-"+ index);
	}
}
