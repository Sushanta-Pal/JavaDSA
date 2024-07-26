import java.util.ArrayList;
import java.util.List;

public class L17 {
    public static void main(String[] args) {
        L17 ob= new L17();
        System.out.println(ob.letterCombinations("23"));
    }
    List<String> ans=new ArrayList<>();
     public  List<String> letterCombinations(String digits) {
        
        if(digits.length()==0) return ans;
         helper(digits,"");
         return ans;
    }
    private void helper(String digits, String str) {
                    if (digits.length()==0) {
                        ans.add(str);
                        return;
                    }
                    int ch=Integer.parseUnsignedInt(digits.charAt(0)+"");
                   int l=(ch==7 ||ch==9)?4:3;
                   char curr =(ch>7)?'b':'a';
                    for(int i=0;i<l;i++){
                                helper(digits.substring(1), str+(char)(curr+((ch-2)*3)+i));
                    }
        
    }
}
