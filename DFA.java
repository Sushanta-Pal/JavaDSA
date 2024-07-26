public class DFA {
    public static void main(String[] args) {
        System.out.println(isMatch("aaa", ".*a"));
    }
    static int t=0;
    public static boolean isMatch(String s, String p) {
        if (s.isEmpty()) {
            if(p.isEmpty()||help(p))
            return true;
           else  return false;
        }
        if (p.isEmpty()) {
            return false;
        }
       
        char ch=p.charAt(0);
                if(ch==s.charAt(0)||ch=='.'){
                    if (p.length()>1 && p.charAt(1)=='*') {
                        t++;
                        return isMatch(s.substring(1),p);
                    }else{
                        return isMatch(s.substring(1),p.substring(1));
                    }
                }
                return isMatch(s,p.substring(1));
    }
    private static boolean help(String p) {
        if (p.length()>2) {
            for(int i=2;i<p.length() && t>0;i++,t--){
                if(p.charAt(i)!=p.charAt(0) &&p.charAt(0)!='.') return false;
            }
        }
        return true;
        }
}
