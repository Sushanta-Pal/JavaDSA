import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class bs {
    public static void reverseString(char[] s) {
        help(s,0,s.length-1);
    }
    private static void help(char[] s, int si, int ei) {
  if (si>ei) {
    return;
  }
        char tem = s[si];
        s[si]=s[ei];
        s[ei] = tem;
         help(s,si+1,ei-1);

    }
    public static int fib(int n) {
        //return (int) ((Math.pow((1+Math.sqrt(5))/2, n))/Math.sqrt(5));
        if (n<2) {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static boolean isPowerOfTwo(int n) {
        if(n==0) return false;
      
        return ( (n &(n-1))==0);
    }
    public static boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
       // Integer.toString(9, 3).matches("^10*$")
     //  return (Math.log(n) / Math.log(3) + epsilon) % 1 <= 2 * epsilon;
    }
    public static boolean isPowerOfFour(int n) {
        return n != 0 && ((n&(n-1)) == 0) && (n & 0xAAAAAAAA) == 0;
          }
    public static void main(String[] args) {
        int nums[] ={-1,0,3,5,9,12};
        int terget =10;
        //System.out.println(search(nums,terget));
        char s[]={'h','e','l','l','o'};
        //System.out.println(s);
       // reverseString(s);
       // System.out.println(s);
       //System.out.println(fib(5));
      // System.out.println(isPowerOfTwo(8));
      System.out.println(isPowerOfThree(19));
      System.out.println(Integer.toString(9, 3).matches("^10*$"));
     

    }
        public static int search(int[] nums, int target) {
           return helper(nums,target,0,nums.length-1);
        }
        private static int helper(int[] nums, int target, int si, int ei) {
            if (si>ei) {
                return -1;
            }
            int mid = si +(ei-si)/2;
            if (nums[mid]==target) {
                return mid;
            }
            if (nums[mid]<target) {
                return helper(nums,target,mid+1,ei);
            }
            return helper(nums,target,si,mid-1);
            
        }
    
}
