import java.util.*;

public class InsertionSort{

    public static void insertSort(int a[]){
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int a[] = {12, 18 ,15, 22, 14};

        /*Insertion  */

        for(int i=0; i<a.length; i++){
            int curr = a[i];

            int j = i-1;
            while(j>= 0 && a[j] > curr){
                // Swaping 
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = curr;
        }
        insertSort(a);

        // Time complexity is O(N^2);

        // Practice 02: Insertuin Sort using while loop

        int[] arr={14,11,10,12,15,13};
        int temp, j;
        System.out.println();
        System.out.println("Inserion sort using while loop");

        for(int i=1; i<arr.length; i++){
            temp = arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp){
                arr[j] = arr[j-1];
                j= j-1;
            }
            arr[j]=temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}