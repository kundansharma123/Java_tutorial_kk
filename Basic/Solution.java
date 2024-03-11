public class Solution {
    
        public static long reverseBits(long n) {
            // Write your code here
             long result = 0;
    
            for (int i = 0; i < 32; i++) {
                // Shift the result to the left and add the rightmost bit of n
                result = (result << 1) | (n & 1);
    
                // Shift n to the right to get the next bit
                n >>= 1;
            }
    
            return result;
        }
        public static void main(String[] args) {
            long n=12;
            reverseBits(n);
        }
    }
    
    

