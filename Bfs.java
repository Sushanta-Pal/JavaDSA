
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

import java.util.Queue;
import java.util.Set;

public class Bfs {
    public static void main(String[] args) {
        String[] deadends = {"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";

        System.out.println(openlockK(deadends, target));
    }

    public static int openlockK(String[] deadends, String target) {
        Set<String> dead = new HashSet<>();
        Collections.addAll(dead, deadends);
        if (dead.contains("0000")) {
            return -1; //edge condition
        }

        Queue<String> q = new LinkedList<>();
        q.offer("0000");
        int turn = 0;

        while (!q.isEmpty()) {
            int size = q.size();
         

            for (int i = 0; i < size; i++) {
                String curr = q.remove();
                if (curr.equals(target)) {
                    return turn;
                }
                if (dead.contains(curr)) {
                    continue;
                }
                dead.add(curr);  
                // Generate next options and add to the queue
                NextOptions(curr,q,dead);
                // Queue<String> list =getNextOptions(curr);
                // while(!list.isEmpty()){
                //   String  t=list.remove();
                //         if(!dead.contains(t)){
                //             q.offer(t);
                //         }
                // }
            }
            turn++;
        }

        return -1;
    }

    private static Queue<String> getNextOptions(String curr) {
        Queue<String> list = new LinkedList<>();
        for(int i=0;i<4;i++){
            StringBuilder sb =new StringBuilder(curr);
            sb.setCharAt(i, getincr(sb.charAt(i)));
           list.add(sb.toString());
           sb.setLength(0);
           sb.append(curr);
            sb.setCharAt(i, getidcrr(sb.charAt(i)));
            list.add(sb.toString());
     }
        return list;
       }

    private static void NextOptions(String curr, Queue<String> q, Set<String> dead) {

             for(int i=0;i<4;i++){
                    StringBuilder sb =new StringBuilder(curr);
                    sb.setCharAt(i, getincr(sb.charAt(i)));
                    if (!dead.contains(sb.toString())) {
                       q.offer(sb.toString()) ;
                    }
                    sb.setLength(0);
                    sb.append(curr);
                    sb.setCharAt(i, getidcrr(sb.charAt(i)));
                    if (!dead.contains(sb.toString())) {
                        q.offer(sb.toString());
                    }
             }
         }


    private static char getincr(char c) {
       return (char) (c=='9'?'0':c+1);
      }
      private static char getidcrr(char c) {
        return (char) (c=='0'?'9':(c-1));
       }
}

