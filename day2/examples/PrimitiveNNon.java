public class PrimitiveNNon {

  static void sum(int a) {
    a++;
    System.out.println(a);
  }

  static void sumArr(int[] arr) {
    arr[0]++;
  }

  public static void main(String[] args) {

    int data = 7;

    // System.out.println(data);
    // System.out.println(arr);
    //
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(" " + arr[i]);
    // }

    int a = 3;
    sum(a);

    System.out.println(a);

    int[] arr = { 3, 4, 5 };
    sumArr(arr);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(" " + arr[i]);
    }

  }

}
