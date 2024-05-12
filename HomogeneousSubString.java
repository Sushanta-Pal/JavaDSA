public class HomogeneousSubString {
    public static void main(String[] args) {
        String s = "abbcccaa";
        System.out.println(countHomogenous(s));
    }
    public static int countHomogenous(String s) {
        if(s.isEmpty()){
            return 0;
        }
        if (s.length()==1) {
            return 1;
        }
        int c=0;
        if (s.charAt(0)!=s.charAt(1)||s.substring(1).isEmpty()) {
            c=1;
            return c+countHomogenous(s.substring(1));
        }
        else{
            int i=1;
            while (!s.substring(i).isEmpty()&&s.charAt(0)==s.charAt(i)) {
                c++;
                i++;
            }
            c=c+1;
            return c+countHomogenous(s.substring(1));
        }
    }
}
