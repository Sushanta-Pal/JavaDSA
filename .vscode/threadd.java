

public class threadd extends Thread {
    int i;
    threadd(int i){
        this.i=i;
    }
    public void run(){
        for(int j=0;j<i;j++) {
            System.out.println("chiled : "+j);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        } 
        System.out.println("Child Thread is Over");  
    }
    public static void main(String[] args) {
        System.out.println("Main Begins");
        System.out.println("Go to child Thread");
        threadd c=new threadd(10);
        c.setName("Child_Thread");
        c.start();
        System.out.println("Back to Main Thread");
        for(int j=0;j<5;j++) {
            System.out.println("Main : "+j);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        } 
        System.out.println("Main Thread is Over"); 

    }
}
/*Write an application which creates two threads one child and another is main that is running
 simultaneously in the system by extending the thread class. The child thread  has to display to 
 nos from 1 to 10 and the main thread has to display the number of the child thread multiplied by 5 .
  Put the name of the child thread and to display its name and overall execution.

 */
