public class L1598 {
    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","./","d3/","../","d31/"};
        System.out.println(minOperations(logs));
    }
    public static int minOperations(String[] logs) {
        int ans =0;
        for(int i=0;i<logs.length;i++){
            if(logs[i].equals("../")){
                        if (ans!=0) {
                            ans--;
                        }
                        continue;
            }
            else if(logs[i].equals("./")){
                continue;
            }
            else ans++;
        

    }
    return ans;
}
}
