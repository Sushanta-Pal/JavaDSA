public class DFA {
    public static void main(String[] args) {
        
    }
    public boolean isMatch(String s, String p) {
        if (s == null || p == null) return true;
        if (s.charAt(0)==p.charAt(0)) {
            return isMatch(s.substring(1),p.substring(1));
        }else if
            (p.charAt(0)=='.'){
                return true;

        }
         else {
            return false;
        }
    }
}
