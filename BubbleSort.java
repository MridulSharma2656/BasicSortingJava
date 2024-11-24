package SkiilsPw.SortingJava;

import java.util.Scanner;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
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
        // BUBBLE SORT-1
        while ( j < l) {
            for(i = 0;i<(l-1);i++)
            {
                if (arr[i] > arr[i+1]) {
               int temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
                }
            }
            j++;
        }
        print(arr);
        // BUBBLE SORT-2
        while ( j < (l-1)) {
            for(i = 0;i<(l-1-j);i++)
            {
                if (arr[i] > arr[i+1]) {
               int temp = arr[i];
               arr[i] = arr[i+1];
               arr[i+1] = temp;
                }
            }
            j++;
        }
        print(arr);
        // BUBBLE SORT-3
        boolean flag = true;
        while ( j < (l-1)) {
            for(i = 0;i<(l-1-j);i++)
            {
                if (arr[i] > arr[i+1]) {
                 int temp = arr[i];
                 arr[i] = arr[i+1];
                 arr[i+1] = temp;
                 flag = false;
                }
            }
            if (flag == true) {
                break;
            }
            else j++;
        }
        print(arr);
    }
    public static void print(int[] arr){
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
