public class L1823 {
    public static void main(String[] args) {
        
    }
    public static int findTheWinner(int n, int k) {
        int ans=0;
boolean[] vis=new boolean[n+1];
vis[0]=true;
int count=0;
int idx=0;

while (count<n) {
    int c=(1+idx)%n;
    for(int i=1;i<k;i++){
        
    }
    idx=c;
    count++;
}
for(int i=0;i<n+1;i++) 
if(!vis[i]) ans=i;

        return ans;
    }
}
