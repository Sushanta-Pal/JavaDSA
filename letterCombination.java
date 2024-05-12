public class letterCombination {
    public static void main(String[] args) {
        String s ="123";
        Keypad(s,"");
    }

    private static void Keypad(String s,String ans) {
        if (s.isEmpty()) {
            System.out.println(ans);
            return;
        }
        int Fdigit = s.charAt(0)-'0';
        for(int i=(Fdigit-1)*3;i<(Fdigit*3);i++){
            char ch = (char)('a'+i);
            Keypad(s.substring(1), ans+ch);
        }
    }
}
