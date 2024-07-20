public class ScoreStr {
    public static void main(String[] args) {
        String s="hello";
        ScoreStr ob= new ScoreStr();
        System.out.println(ob.scoreOfString(s));
    }
    public int scoreOfString(String s) {
        int ans =0;
        for(int i =1; i<s.length(); i++){
            ans+=Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return ans;
    }
}
