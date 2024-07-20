public class L10 {
    public static void main(String[] args) {
        System.out.println(isMatch("ab", ".*c"));
    }
    public static boolean isMatch(String s, String p) {
        int j=0;
        int i=0;
        if (p.charAt(j)=='*') i++;
        for(;i<s.length()&& j<p.length();i++){
            if (p.charAt(j)=='.') {
                j++;
                continue;
            }
            if (p.charAt(j)=='*') {
                char ch=p.charAt(j-1);
                if(ch=='.' || ch==s.charAt(i)) continue;
                else {
                    j++;
                    i--;
                    continue;
                }
            }
           else if(s.charAt(i)!=p.charAt(j)){
               i=-1;
               j++;
            }else {
                j++;
            }

        }
        if(i==s.length())
        return true;
        else return false;
    }
    
}
