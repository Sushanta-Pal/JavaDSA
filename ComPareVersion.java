public class ComPareVersion {
    public static void main(String[] args) {
        ComPareVersion ob=new ComPareVersion();
        String version1="1.0.1";
        String version2="1";
        System.out.println(ob.compareVersion(version1, version2));
    }
    public int compareVersion(String version1, String version2) {
        int i=0;
        int j=0;
        int ans1=0;
        int ans2=0;
               while (i<version1.length() && j<version2.length() ){
               
                 while (i<version1.length() && version1.charAt(i)!='.') {
                        ans1=ans1*10+(version1.charAt(i)-'0');
                    i++;
                   
                 }

                 while (j<version2.length() && version2.charAt(j)!='.') {
                    ans2=ans2*10+(version2.charAt(j)-'0');
                j++;
              
             }
             if (ans1>ans2) {
                     return 1;
                 }
                 else if (ans1<ans2) {
                     return -1;
                 }
                 else {
                     i++;
                     j++;
                     ans1=0;
                     ans2=0;
                 }

               }
               while (i<version1.length()){
               
                while (i<version1.length() && version1.charAt(i)!='.') {
                       ans1=ans1*10+(version1.charAt(i)-'0');
                   i++;
                  
                }
            if (ans1>ans2) {
                    return 1;
                }
                else if (ans1<ans2) {
                    return -1;
                }
                else {
                    i++;
                    ans1=0;
                    ans2=0;
                }
              }
           
              while (j<version2.length()){
               
                while (j<version2.length() && version2.charAt(j)!='.') {
                       ans2=ans2*10+(version2.charAt(j)-'0');
                   j++;
                  
                }
            if (ans1>ans2) {
                    return 1;
                }
                else if (ans1<ans2) {
                    return -1;
                }
                else {
                    j++;
                    ans1=0;
                    ans2=0;
                }
              }
        
        
               return 0;
    }
}
