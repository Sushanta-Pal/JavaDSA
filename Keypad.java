import java.util.ArrayList;
import java.util.List;

public class Keypad {
    public static void main(String[] args) {
        
    }
     public List<String> letterCombinations(String digits) {
       List<String> list= new ArrayList<>();
       int pos=Integer.parseInt(digits.charAt(0)+"")+'a';
       for(int i=0;i<3;i++){
         String curr=String.valueOf((char)(pos+i));
         }
       return list;
    }
}
