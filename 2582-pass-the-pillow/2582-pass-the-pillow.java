class Solution {
    public int passThePillow(int n, int time) {
            boolean dir=true;
        while (time>0) {
            if (dir) {
                if (n>time) {
                    return time+1;
                }
            }
            else {
                if (n>time) {
                    return n-time;
                }
            }
                time-=n-1;
                dir=!dir;
        }
        return 0;
    }
}