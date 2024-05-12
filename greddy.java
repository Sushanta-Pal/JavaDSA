public class greddy {
    public static void main(String[] args) {
        String word = "aiaaeeioueo";
        System.out.println(longestBeautifulSubstring(word));
    }
   /* public static int longestBeautifulSubstring(String word) {
        int max=0;
        if (word.length()<5) {
            return max;
        }
        int count=0;
        char s='x';
        for(int i=word.length()-1;i>=0;i--){
            if (word.charAt(i)=='a') {
                max=Math.max(max, count);
            }
           
            if (word.charAt(i)!='u'&&count==0) {
                continue;
            }
            if (word.charAt(i)=='u'&&count==0) {
                count++;
                s=word.charAt(i);
                continue;
            }
            if (word.charAt(i)=='u'&& s =='u') {
                count++;
                continue;
            }

            if (word.charAt(i)=='o'&&s=='u') {
                count++;
                s=word.charAt(i);
                continue;
            }
            else count=0;

            if (word.charAt(i)=='o'&& s =='o') {
                count++;
                continue;
            }
            if (word.charAt(i)=='i'&& s=='o') {
                count++;
                s=word.charAt(i);
                continue;
            }
            else count=0;
           

        }
        return max;
    }

 */
public static int longestBeautifulSubstring(String word) {
        int len=1;
        int count=1;
        int maxLen=0;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i-1)<=word.charAt(i)){
                if(word.charAt(i-1)!=word.charAt(i)){
                    count++;
                }
                len++;
                if(count==5){
                    maxLen=Math.max(maxLen,len);
                }
            }
            else{
                len=1;
                count=1;
            }
        }

        return maxLen;
}
}
