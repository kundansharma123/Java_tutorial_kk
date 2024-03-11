public class Celling {
    public static void main(String[] args) {
        int[] arr ={ 12,34,38,45,56,78,90};
        int target=40;
        int ans=ceiling(arr, target);
        System.out.println(ans);

    }
    //return the index of smallest no >= target
    static int ceiling(int[] arr, int target){
        //but what is the target is greater than the greatest number in the array
        if(target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        while(start <= end){
            int mid=start + (end-start)/2;
            if(target < arr[mid]){
                end=mid-1;
            }
            else if(target > arr[mid]){
                start=mid+1;
            }
            else 
            //return mid;
            return arr[mid];
        }
        //return start;
        return arr[start];

    }
    
}
