public class BinarySearch {

    public static void main(String[] args) {
        int [] arr={1,23,24,56,87,89,98};
        int target=87;
        int ans=binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int [] arr, int target){
        int start=0;
        int end=arr.length -1;
        while(start<=end){
            //find the middle element
            int mid = start + (end-start)/2;
            if(target > arr[mid]){
                start=mid+1;
            }
            else if(target < arr[mid]){
                end=mid -1;
            }
            else 
                return mid ;

            }
        
        return -1;

    }
}