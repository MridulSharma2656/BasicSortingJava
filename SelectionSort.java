package SkiilsPw.SortingJava;
import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int l = sc.nextInt();
        int[]arr = new int[l];
        int i;
        for(i=0;i<l;i++)
        {
            System.out.print("Enter the element number "+(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        print(arr);
        int j = 0;
        while (j<(l-1)) {
            int min = Integer.MAX_VALUE;
            int minpos = -1;
            for( i = j;i<l;i++){
                if (arr[i] < min) {
                    min = arr[i];
                    minpos = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[minpos];
            arr[minpos] = temp;
            j++;
        }
        print(arr);
    }
    public static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
