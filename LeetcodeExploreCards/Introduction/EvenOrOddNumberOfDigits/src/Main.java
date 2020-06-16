import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    System.out.println("Enter the array length: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter array elements: ");
    for(int i=0; i < arr.length;i++){
      arr[i] = sc.nextInt();
    }

    int max = s.findNumbers(arr);
    System.out.println("Maximum number of even numbers in array are: " + max);

  }
}
