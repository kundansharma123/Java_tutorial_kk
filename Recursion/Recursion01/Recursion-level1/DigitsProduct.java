public class DigitsProduct { 
    public static void main(String[] args) {
        int ans = product(514);
        System.out.println(ans);
    }
    static int product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10) * product(n/10);
    }
}
