public class OrderAgnostic {

    public static void main(String[] args) {
        int [] arr={98,86,76,65,54,43,32};
        int target=65;
        int ans=orderAgnostic(arr, target);
        System.out.println(ans);
    }
    static int orderAgnostic(int [] arr , int target){
        int start=0;
        int end=arr.length -1;
        boolean  isAsc = arr[start] < arr[end] ;
        while(start<=end){
            //find the middle element
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end=mid-1;
                }
                else {
                    start=mid + 1;
                }
            
            }
            else {
                if(target > arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid-1;
                }
            }
            
        }
        return -1;
    } 
    
}

