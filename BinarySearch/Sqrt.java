package BinarySearch;

import java.util.Arrays;
import java.util.Stack;

public class Sqrt{
    public static void main(String[] args) {
        // System.out.println("Hara Krishana");
        // System.out.println(minOperations( "0100"));
        System.out.println(numDecodings("111111111111111111111111111111111111111111111"));
    }
    public static int minOperations(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            if (i%2==0 && s.charAt(i)=='1') {
                count++;
            }
             if (i%2!=0 && s.charAt(i)=='0') {
                count++;
            }
        }
        return Math.min(count,s.length()-count);
    }
    // public List<List<Integer>> fourSum(int[] nums, int target) {
        
    // }/
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else if (!st.isEmpty() && ((s.charAt(i) == ')' && st.peek() == '(') ||
                    (s.charAt(i) == '}' && st.peek() == '{') ||
                    (s.charAt(i) == ']' && st.peek() == '['))) {
                st.pop();
            } else {
                // Invalid closing parenthesis without matching opening parenthesis
                return false;
            }
        }
        return st.isEmpty();
    }

    public static int removeElement(int[] nums, int val) {
        int c=0;
        for(int i:nums){
            if (val!=i) {
                nums[c]=i;
                c++;
            }
        }
        return (c);
    }
    // public static int strStr(String haystack, String needle) {
    
    // }
    public static int[] memo = new int[101];

    public static int numDecodings(String s) {
        int n = s.length();
        memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return solve(0, s, n);
    }

    private static int solve(int i, String s, int n) {
        if (memo[i] != -1) {
            return memo[i];
        }

        if (i == n) {
            return memo[i] = 1; // one valid split done
        }

        if (s.charAt(i) == '0') {
            return memo[i] = 0; // not possible to split
        }

        int result = solve(i + 1, s, n);

        if (i + 1 < n) {
            if (s.charAt(i) == '1' || (s.charAt(i) == '2' && s.charAt(i + 1) <= '6')) {
                result += solve(i + 2, s, n);
            }
        }

        return memo[i] = result;
    }
   
    
}
    

