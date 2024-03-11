public class Floor {
    public static void main(String[] args) {
        int [] arr={23,34,36,38,45,48,54,56,80};
        int target=42;
        int ans=floor(arr, target);
        System.out.println(ans);
    }
    //return the index: greater number <= target
    static int floor(int []arr , int target){
          int start=0;
          int end= arr.length -1;
          while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start= mid + 1;

            }
            else 
            //to get index return mid;
            return arr[mid];             
    }
    //to get index return end;
    return arr[end];
}
    
}
