//find all duplicate element in the list

import java.util.ArrayList;
import java.util.List;

public class AllDuplicate {
    public static void main(String[] args) {
        int[] nums={3,1,2,2,4,3};
        List<Integer> list= findAllDuplicate(nums);
        for(int i:list){
            System.out.println(i+" ");
        }
      
    }

    public static List<Integer>  findAllDuplicate(int [] nums){
        int i=0;
        while(i<nums.length){
            

                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                
               else{
                i++;
            }
        }
        //find the all duplicate element
        List<Integer> ans=new ArrayList<>();
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(nums[index]);
            }
        }
        return ans;
    }
    static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

}
