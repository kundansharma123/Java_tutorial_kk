package Recursion01;

public class BasicRecursion1 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int n){
        //WE need to mention base condition where our functions stop make  recursive calls.
        if(n==6){
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        print(n+1);

    }
    
}
