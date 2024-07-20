public class ZigZag {
    public static void main(String[] args) {
   
    }
    public String convert(String s, int numRows) {
        StringBuilder[] sb = new StringBuilder[numRows];
       for (int i = 0; i < numRows; i++) {
           sb[i] = new StringBuilder();
       }
       int step=2*numRows-3; //4
       int idx=0;
       for(int i=0;i<s.length();i+=(step+1)){  // i=0,3,6,9..
           //down
           for(int j=0;j<numRows;j++){
               if(idx<s.length()){
               sb[(i+j)].append(s.charAt(idx++));
               }
           }
           //up
           for(int j=numRows-2;j>0;j--){
                if(idx<s.length()){
               sb[(i+j)].append(s.charAt(idx++));
                }
           }
          
       }

       String ans="";
       for (int i = 0; i < numRows; i++) {
          s +=sb[i];
       }
       return ans;
   }
}
