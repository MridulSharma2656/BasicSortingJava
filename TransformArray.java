package SkiilsPw.SortingJava;

import java.util.Scanner;

public class TransformArray {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int l = sc.nextInt();
        int[]arr = new int[l];
        for(int i=0;i<l;i++)
        {
            System.out.print("Enter the element number "+(i+1)+ " : ");
            arr[i] = sc.nextInt();
        }
        print(arr);
        int i = 0;
        int c = 0;
         for(i = 0;i<l;i++) {
            int min = Integer.MAX_VALUE;
            int minpos = -1;
            for( int j = 0;j<l;j++){
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    minpos = j;
                }
            }
            arr[minpos] = c;
            c--;
        }
        print(arr);
        for(int k = 0;k<l;k++){
            arr[k] *= (-1);
        }
        print(arr);
    }
}

