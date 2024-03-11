//import java.util.List;


public class SetMatching {
    public static void main(String[] args) {
        
    int[] nums={1,2,2,4};
    int[] error = setMatch(nums);
  
    for(int i:error){
        System.out.print(i);
        
      
    }
}
    public static int[] setMatch(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!= nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }

        }
    
    //search for the missing number
    for(int index=0;index<nums.length;index++){
        if(nums[index]!=index+1){
            return new int[]{nums[index],index+1};

        }
    }
    return new int[] {-1,-1};
}
    static void swap(int [] nums, int x, int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}
