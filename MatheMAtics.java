import java.util.Arrays;
import java.util.HashSet;

public class MatheMAtics {
    public static void main(String[] args) {
        //System.out.println(romanToInt("MCMXCIV"));
       // System.out.println(isHappy(98));
        //System.out.println(isArmstrong(153));
       // System.out.println(convertToTitle(701));
    //    int arr[]={-100,-98,-1,2,3,4};
    //    System.out.println(maximumProduct(arr));
   for(int i=0;i<50;i++){
    System.out.println(fib(i));
   }
   // System.out.println(climbStairs(5));
    }
    private static int fib(int n) {
      return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
    public static int climbStairs(int n) {
        if (n<=1) {
          return 1 ;
        }
        int ans =0;
       for(int i=1;i<=2;i++){
       ans= climbStairs(n-i)+ans;
       }
       return ans;
        
    }
    public static int maximumProduct(int[] nums) {
      
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(nums[n-1] * nums[n-2] * nums[n-3],nums[0]*nums[1]*nums[n-1]);
  
    }
    // public static StringBuilder convertToTitle(int columnNumber) {
    //     StringBuilder s=new StringBuilder();
       
    //     while (columnNumber>0) {
    //         columnNumber--;
    //         s.append((char)('A'+((columnNumber)%26)));
    //        columnNumber/=26;
    //     }
        
    //     return s.reverse();
    // }
   
    public static String convertToTitle(int columnNumber) {
       
       String s="";
       if (columnNumber==0) {
        return s;   
       }
       columnNumber--;
       char ch=(char)('A'+(columnNumber)%26);
       s=s+ch;
       columnNumber/=26;
       return convertToTitle(columnNumber)+s;
       
    }
    
    private static boolean isArmstrong(int n) {
         int digit = (int) (Math.log(n)/Math.log(10)) +1;
         int ans=0;
         int N=n;
         while (n>0) {
            ans+=Math.pow(n%10, digit);
            n/=10;
         }
        return (ans==N);
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> hs =new HashSet<>();
        while (n!=1) {
            if (hs.contains(n)) {
            return false;
           }
           hs.add(n);
           int sq =0;
           while (n>0) {
             sq+=(n%10) *(n%10);
             n/=10;
           }
           n=sq;
        }
           
        return true;
    }
    public static int romanToInt(String s) {
        int i=0;
        int ans =0;
        while (i<s.length()) {
            if (s.charAt(i)=='I') {
                if (i==s.length()-1 || s.charAt(i+1)!='V' && s.charAt(i+1)!= 'X'&& s.charAt(i+1)!='L'&& s.charAt(i+1)!='C'&& s.charAt(i+1)!='D'&& s.charAt(i+1)!='M') {
                     ans+=1;
                }
                else 
                ans-=1;
            }
            else if (s.charAt(i)=='V' )  {
                    if (i==s.length()-1 ||s.charAt(i+1)!= 'X'&& s.charAt(i+1)!='L'&& s.charAt(i+1)!='C'&& s.charAt(i+1)!='D'&& s.charAt(i+1)!='M') {
                        ans+=5;
                    }
                    else ans-=5;
            }
            else if (s.charAt(i)=='X') {
                if (i==s.length()-1 ||s.charAt(i+1)!='L'&& s.charAt(i+1)!='C'&& s.charAt(i+1)!='D'&& s.charAt(i+1)!='M') {
                    ans+=10;
                }
                else ans-=10;
            }
            else  if (s.charAt(i)=='L') {
                if (i==s.length()-1 ||s.charAt(i+1)!='C'&& s.charAt(i+1)!='D'&& s.charAt(i+1)!='M') {
                    ans += 50;
                }
                else ans -=50;
            }
            else if (s.charAt(i)=='C') {
                if (i==s.length()-1 ||s.charAt(i+1)!='D'&& s.charAt(i+1)!='M') {
                    ans +=100;
                }
                else ans-=100;
            }
            else if (s.charAt(i)=='D') {
                if (i==s.length()-1 ||s.charAt(i+1)!='M') {
                    ans +=500;
                }
                else
                 ans-=500;
            }
            else if (s.charAt(i)=='M') {
                ans +=1000;
            }
                    i++;
            }
            
        return ans;
        
    }
}
