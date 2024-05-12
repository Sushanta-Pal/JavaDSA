public class LongestPalindrome {
    static String ans="";
    public static void main(String[] args) {
        String str="babad";
        System.out.println(longestPalindrome(str));
    }
    public static String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
           help(s,0,s.length()-i-1);
           
        }
        return ans;
    }
    private static void help(String s, int i, int j) {
            if (i>j) {
                return ;
            }
            if (palindrome(s,i,j)) {
               if (s.substring(i,j+1).length()>ans.length()) {
                ans=s.substring(i,j+1);

               } 
            }
              help(s, i+1, j);
                       
             }
    private static boolean palindrome(String s, int i, int j) {

               while (i<j) {
                if(s.charAt(i)!=s.charAt(j)) return false;
                i++;
                j--;
               }
               return true;
          }
}
