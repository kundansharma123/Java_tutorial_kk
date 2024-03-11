//it will not work for duplicate value

public class Rotated {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2};
        System.out.println(pivot(arr));
    }
    static int search(int [] nums, int target){
          int pivot1=pivot(nums);
          ///if u not find a pivot,means array is not rotated
          if(pivot1 == -1){
            return binarySearch(nums, target,0 , nums.length -1);
          }
          //if pivot is found
          if(nums[pivot1] == target){
            return pivot1;
          }
          if(target >= nums[0]){
            return binarySearch(nums, target, 0, pivot1-1);
          }
          return binarySearch(nums, target, pivot1 + 1, nums.length-1);
    }
    static int binarySearch(int [] arr, int target,int start , int end){
       
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

    static int pivot(int [] arr){
        int start=0;
        int end=arr.length -1;
        while (start < end) {
            int mid=start+(end-start)/2;
            //4 cases will be check
            if(mid<end && arr[mid]> arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid -1;
            }
            if(arr[mid] <= arr[start]){
                end= mid-1;
            }else {
                start=mid+1;
            }
            
        }
        return -1;
    }
    
}
