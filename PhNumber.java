import java.util.ArrayList;
import java.util.List;

public class PhNumber {
    public static void main(String[] args) {
        System.out.println(new PhNumber().letterCombinations("23"));
    }
    List<String> list=new ArrayList<>();
     public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
            return list;
             help(digits,"");
             return list;
    }
    private void help(String digits, String string) {
        if(digits.length()==0)
        {
            list.add(string);
            return;
        }
        for(int i=0;i<3;i++){
            help(digits.substring(1, digits.length()), string+(((digits.charAt(i)-'2')*3)+'a'));
        }
    }
}
