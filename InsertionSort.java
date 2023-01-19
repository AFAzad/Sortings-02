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
    }
}