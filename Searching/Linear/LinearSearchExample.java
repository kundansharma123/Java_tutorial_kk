public class LinearSearchExample {
    public static void main(String[] args) {
        int[] nums={12,43,23,21,24};
        int target=21;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }
    //search in the array return the index if found 
    //other wise return -1
    static int linearSearch(int[] arr, int target){
         if(arr.length==0){
            return -1;
         }


         for(int i=0;i<arr.length;i++){
            int element= arr[i];
            if(element==target){
                return i;
            }
         }
    
    return -1;
}
}
