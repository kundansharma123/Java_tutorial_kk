public class Main {
    public static void main(String[] args) {
        //patern1(6);
        //patter2(4);
        //pattern3(4);
        //patern4(4);
        //pattern5(5);
        //pattern28(5);
        //pattern30(5);
        pattern31(4);
    }
    static void patern1(int n){
        for(int i = 1 ;i<=n ;i++){
            for(int j =1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    static void patter2(int n){
        for(int i =1;i<=n ; i++){
            for(int j =1 ; j<=n ; j++){
                System.out.print("*");
            }System.out.println();
            
        }
    }
    
    static void pattern3(int n){
        for(int i =1 ; i<=n; i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patern4(int n){
        for(int i = 1 ;i<=n ;i++){
            for(int j =1 ; j<=i ;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
    static void pattern5(int n){
        for(int i=0;i < 2*n;i++){
             int totalcolsinRow = i > n? 2 * n - i :i;
            for(int j=0;j<totalcolsinRow;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for(int i=0;i < 2*n;i++){
            int totalcolsinRow = i > n? 2 * n - i :i;
           int noofSpaces = n -  totalcolsinRow;
            for(int s =0 ; s<noofSpaces ;s++)
               System.out.print(" ");

            for(int j=0;j<totalcolsinRow;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    static void pattern30(int n ){
       
        for(int i =1;i<=n;i++){
            for(int space = 0;space < n-i;space++ )
             System.out.print("  ");

            for(int j = i; j>=1;j--){
                System.out.print(j + " ");
                
            }
            for(int j=2;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
    }
    static void pattern31(int n){
        n=2*n;
        for(int i=0;i<=n ;i++){
            for(int j=0;j<=n;j++){
                int atEveryIndex= Math.min(Math.min(i,j), Math.min(n-i ,n-j));
                System.out.print(atEveryIndex+ "");
            }
            System.out.println();
        }
    }
}
