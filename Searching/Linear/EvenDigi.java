public class EvenDigi {
    public static void main(String[] args) {
        int [] nums={12,342,45,76,564};
     System.out.println(findNumbers(nums));
        
    }
    static int findNumbers(int [] nums){
        int count=0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
        
    static boolean even(int  num){
        int numberOfDigits=digit(num);
        if(numberOfDigits%2==0){
        return true;
        }
        else return false;
        //shortcut return numberOfDigits%2==0;
        
    }
    static int digit(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
        
    
    }
    
}

