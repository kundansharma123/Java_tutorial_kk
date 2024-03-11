import java.util.Arrays;

public class FirstLast {
    public static void main(String[] args) {
        int [] nums ={5,7,7,8,8,10};
        int target = 8;
        int[] s=searchRange(nums, target);
        System.out.println(Arrays.toString(s));
        
    }
    public static int [] searchRange(int [] nums ,int target){
        int [] ans = {-1,-1};

    //     check for first occurrence if target first
    //     ans[0] = search(nums, target, true);
    //     if (ans[0] != -1) {
    //         ans[1] = search(nums, target, false);
    //     }
    //     return ans;
    // }
        
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int [] nums , int target , boolean firstIndex){
        int ans = -1;
        int start=0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid -1;
            }
            else if(target > nums[mid]){
                start= mid+1;
            }
            else{
                ans=mid;
                if(firstIndex){
                    end = mid-1;
                }
                else{
                    start= mid + 1;
                }
            }
        }
        return ans;
    }

    
}