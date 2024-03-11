// worst case time complexity- O(N2)
//Best case  time complexity- O(N2)
//it performs well on small list/array
//A sorting algorithm is said to be stable if two objects with equal keys appear in the same order in sorted 
//output as they appear in the input data set.

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr={2,5,1,6,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int [] arr){
          for(int i=0;i<arr.length ;i++){
            int last=arr.length -i -1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr, maxIndex , last);
        }
    }
    static void swap( int [] arr ,int first , int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;

    }
   static int getMaxIndex(int [] arr,int start, int last){
    int max=start;
    for(int i=start;i<=last;i++){
        if(arr[max] < arr[start]){
            max=i;
        }
    }
    return max;

   }
    
}
