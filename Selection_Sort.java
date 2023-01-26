public class Selection_Sort {
    public static void main(String args[]){
        int arr[] = {12, 7, 16, 25, 15,23};
        // int min;
        // int temp;

        for(int i=0; i<arr.length; i++){
           int min = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            // swaping
            int temp;
            temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        // Printing the array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
