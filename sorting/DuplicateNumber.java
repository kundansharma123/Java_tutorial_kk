public class DuplicateNumber {
    public static void main(String[] args) {
        int[] nums={3,1,2,4,3};
        int duplicate = findDuplicate(nums);
        System.out.println("Duplicate Element is : " + duplicate);
        
    }
    public static int  findDuplicate(int [] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1){

                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else{
                    return nums[i];
                }}
            else{
                i++;
            }
                
            }
            return -1;
        }
        static void swap(int [] nums , int x, int y){
            int temp=nums[x];
            nums[x]=nums[y];
            nums[y] =temp;
        }
    
}
