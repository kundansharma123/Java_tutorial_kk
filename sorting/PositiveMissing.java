public class PositiveMissing {
    public static void main(String[] args) {
        //import java.util.Arrays;

        int[] nums = { 1, 2,0 };
       // sort(nums);
        //System.out.println(Arrays.toString(nums));
        System.out.println(sort(nums));
    }
    

   public  static int sort(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums [i]> 0 && nums[i]<=nums.length && nums[i]!=nums[correct]){
                swap(nums,i, correct);

            }
            else {
                i++;
            }}
            //find the first missing number
            for(int index=0;index<nums.length;index++){
                if(nums[index]!=index+1){
                    return index +1;
                }
                
            }
            return nums.length +1;
        }
             public static void  swap(int[] arr, int x, int y) {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
 



             }}

