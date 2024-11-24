package SkiilsPw.SortingJava;

import java.util.Scanner;

public class InsertionSort {
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
        while (j<(l)) {
            for( i = j;i>=1;i--){
                if (arr[i] < arr[i-1]) {
                    int temp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = temp;
                }
                else{
                    break;
                }
            }
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

