import java.util.Scanner;
public class SortingAlgo {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sorting Algorithm\n\nEnter the size: ");
        int size = scanner.nextInt();
        
        System.out.println("Enter " + size + " numbers to sort\n");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + (i + 1) + ". ");
            arr[i] = scanner.nextInt();
        } 
        
        System.out.println("Choose a sorting algorithm:");
        System.out.println("\t[1] = Bubble Sort");
        System.out.println("\t[2] = Balloon Sort");
        System.out.println("\t[3] = Selection Sort");
        System.out.println("\t[4] = Merge Sort");
        System.out.println("\t[5] = Insertion Sort");
        System.out.println("\t[6] = Quick Sort");
        System.out.println("\t[0] = Exit");
        System.out.print("Choose: ");
        int option = scanner.nextInt();
       // while (option != 0) {
            switch(option) {
                case 0:
                  
                    break;
                case 1:
                    bubbleSort(arr);
                    break;
                case 2:
                    balloonSort(arr);
                    break;
                case 3:
                    selectionSort(arr);
                    break;
                case 4:
                    mergeSort(arr);
                    break;
                case 5:
                   // insertionSort(arr);
                    break;
                case 6:
                   // quickSort(arr);
                    break;
                default:
                    break;
            }
        //}
        
    }
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted Array using Bubble Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void balloonSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    k = j;
                    int temp =  arr[i];
                    arr[i] = arr[k];
                    arr[k] = temp;
                }   
            }
        }
        System.out.print("Sorted Array using Balloon Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.print("Sorted Array using Balloon Sort: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int[] arr) {
        int length = arr.length;
        if (length <= 1) return;

        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        int i = 0;
        int j = 0;

        for (; i < length; i++) {
            if (i < middle) {
                leftArr[i] = arr[i];
            } else {
                rightArr[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }
    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize; 
        int i = 0, l = 0, r = 0; //indices
        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while (l < leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while (r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }
}
