public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(2, 4));
    }
    static int gcd(int a, int b){
        if(a==0){
            return b;
        } 
        return  gcd(b%a, a);
    }

    
}
