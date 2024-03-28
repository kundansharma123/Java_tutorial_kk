// You are given an integer ‘n’.
// Your task is determining the sum of the first ‘n’ natural numbers and returning it.
// Example:
// Input: ‘n’ = 3
// Output: 6
// Explanation: The sum of the first 3 natural numbers is 1 + 2 + 3, equal to 6.

public class Solution {
    
        public static long sumFirstN(long n) {
            // Write your code here.
            return n * (n + 1) / 2;
        }
    
        public static void main(String[] args) {
            // Example usage
            long n =5;
            long sum = sumFirstN(n);
            System.out.println(sum);
        
            
        }
    }
    
