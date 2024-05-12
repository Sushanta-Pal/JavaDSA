public class strings {
    public static void main(String[] args) {
        String str = "abc";
       subSet(str,"");
        subSet(str);
        
    }

    private static void subSet(String str) {
         System.out.println(str);
        for(int i=0;i<str.length();i++){
            String s=str.substring(i+1);
            for(int j=0;j<s.length();j++){
                System.out.println(str.charAt(i)+""+s.charAt(j));
            }
            System.out.println(str.charAt(i));
        }
       

    }

    private static void subSet(String str, String subset) {
        if (str.isEmpty()) {
            System.out.println(subset);
            return;
        }
        char ch = str.charAt(0);
        subSet(str.substring(1),subset+ch);
        subSet(str.substring(1),subset);
    }
}
