//Space Complexity = O(1) //constrast // No extra space required i.e coping the array ,not required
//time Complexity- Best Case -O(n)=> when the array is sorted
//Worst case --> O(n2) when the array is sorted in opposite //or no of comaprision bwcome greater
//As the size of array is growing , the no of comparision is also growing.

import java.util.Arrays;

public class BubbleSort {
           public static void main(String[] args) {
            int [] arr={-3,5,2,6,-1};
            bubble(arr);
            System.out.println(Arrays.toString(arr));
           }   
           static void bubble(int [] arr){
            boolean swapped;
            for(int i=0;i<arr.length;i++){
                
                swapped=false;
                for(int j=1;j<arr.length -i;j++){
                    if(arr[j]<arr[j-1]){
                        int temp = arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;
                        swapped=true;

                    }
                
                }
                if(!swapped) //!false = true
                break;
                
            }
           }
    
}