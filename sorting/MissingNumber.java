//import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = { 4, 0, 2,1 };
       // sort(nums);
        //System.out.println(Arrays.toString(nums));
        System.out.println(sort(nums));
    }

    static int sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i];
            if(nums[i]<nums.length && nums[i]!=nums[correct]){
                swap(nums,i, correct);

            }
            else {
                i++;
            }}
            //find the first missing number
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index){
                    return index;
                }
                
            }
            return nums.length;
        }
             public static void  swap(int[] arr, int x, int y) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                
            
             
        
    }

}
