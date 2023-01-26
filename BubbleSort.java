import java.util.*;
public class BubbleSort{
    public static void main(String[] args){
        int[] a = {15, 10, 25, 35, 20};
        int temp;
        for(int i=0; i<a.length; i++){
            int flag =0;
            for(int j=0; j<a.length-1-i; j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag =1;
                }
            }
            if(flag == 0){
                break;
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
            System.out.println();
        }

        // array  in decending order applying bubble sort

        int arr[] = {3, 5, 9, 7, 4};

        // int temp;

        for(int i =0; i<arr.length; i++){

            

            for(int j=0; j<arr.length-1-i; j++){
                
                if(arr[j+1] > arr[j]){ // for acending just reverse the condition ==>>:  arr[j] > arr[j+1]
                    temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                    
                }
            }
            
        }
        System.out.println("The new arr is decending order: ");
        for(int i=0; i <arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

    /* time complexity 
     * Best case is O(n) when array is sorted 
     * Worst case is : O(n^2) when array is sorted in opposite
     */
}