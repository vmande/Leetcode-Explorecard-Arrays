import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Solution s = new Solution();
    System.out.println("Take the input length of array:");
    int n = sc.nextInt();
    int max =0;
    int[] arr = new int[n];
    System.out.println("Enter the numbers in array: ");
    for(int i=0; i < arr.length;i++){
      arr[i] = sc.nextInt();
    }

    max = s.maxConsecutiveOnes(arr);
    System.out.println("Maximum consecutive ones in the given array are: " + max);
  }
}
