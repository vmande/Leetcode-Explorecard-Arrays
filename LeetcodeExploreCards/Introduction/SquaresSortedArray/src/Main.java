import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the array elements: ");
    for(int i=0; i< arr.length;i++){
      arr[i] = sc.nextInt();
    }

   Solution.sortedSquares(arr);
    System.out.println("");
    System.out.println("After sort");
    for(int i=0; i < n;i++){
      System.out.println(arr[i]);
    }
  }
}
