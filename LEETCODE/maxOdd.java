package LEETCODE;

public class maxOdd {
    public static void main(String[] args) {
        
    }
    public String maximumOddBinaryNumber(String s) {
        if (s.charAt(s.length()-1)!=1) {
            for(int i=s.length()-2;i>=0;i--){
                if(s.charAt(i)==1){
                    s.charAt(s.length()-1)=s.charAt(i);
                        s.charAt(i)='0';
                        break;
                }
            }
        }
            int j=0;
        for(int i=0;i<s.length()-1;i++){
                if (s.charAt(i)==1) {
                    s.charAt(j++)=1;
                    s.charAt(i)=0;
                }
        }
        return s;
    }
    
}
