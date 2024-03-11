//for every index : put that index element at the correct index of LHS.

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = { -9, 2, -7, 1, 3 };
        insertalgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertalgo(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]< arr[j-1]){
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
            }
        }
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

    }

}

