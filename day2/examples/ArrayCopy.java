import java.util.Arrays;

public class ArrayCopy {

  static void newWay() {
    int[] oldArray = { 1, 2, 3 };
    int newSize = 6;

    // Copy elements into a new, larger array
    int[] biggerArray = Arrays.copyOf(oldArray, newSize);

    System.out.println(Arrays.toString(biggerArray));
    // Output: [1, 2, 3, 0, 0, 0]
  }

  static void manualWay() {
    int[] oldArray = { 1, 2, 3 };
    int newSize = 6;

    // 1. Create a bigger array (automatically filled with 0s)
    int[] biggerArray = new int[newSize];

    // 2. Copy values using a loop
    for (int i = 0; i < oldArray.length; i++) {
      biggerArray[i] = oldArray[i];
    }

    // Print results to verify
    for (int num : biggerArray) {
      System.out.print(num + " ");
    }
    // Output: 1 2 3 0 0 0
  }

  public static void main(String[] args) {
    manualWay();

    System.out.println();

    newWay();
  }
}
