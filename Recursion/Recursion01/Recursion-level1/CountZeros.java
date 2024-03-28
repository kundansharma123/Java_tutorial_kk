//count the number of zeros in the number

public class CountZeros {
    public static void main(String[] args) {
       System.out.println(count(1230300)); 
    }
    static int count(int n){
        return helper(n,0);
    }
    public static  int helper(int n , int c){
        //special example to return same value to above function calls
        
        if(n==0){
            return c;
        }
        int rem = n % 10;
        if(rem == 0){
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
    
}
