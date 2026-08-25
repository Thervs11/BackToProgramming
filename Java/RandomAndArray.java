import java.util.Random;
import java.util.Scanner;
public class RandomAndArray {

    static int arr[];

    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Array: ");
        int size = scanner.nextInt();
        System.out.print("Enter target interger: ");
        int target = scanner.nextInt();

        arr = randomArrayGenerator(size);

        System.out.print("Randomized Array: ");
        printArray(arr);

        int result = counting(arr, target);

        System.out.println("\nElement [" + target + "] occured in the array: " + result);
        scanner.close();
    }

    public static void printArray(int[] arr) {
        for(int element : arr) {
            System.out.print(element + " ");
        }
    }

    public static int[] randomArrayGenerator(int n) {
        Random random = new Random();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(20 + 1);
        }

        return arr;
    }

    private static int counting(int[] arr, int target) {
        return counting(arr,target,0);
    }
    
    private static int counting(int[] arr, int target, int index) {
        if (index == arr.length) {
            return 0;
        }
        int count = (arr[index] == target) ? 1 : 0;
        return count + counting(arr, target, index + 1);
    }
   

}