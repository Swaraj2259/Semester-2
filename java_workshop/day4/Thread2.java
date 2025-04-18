// package java_workshop.day4;

public class Thread2 {
    public static void main(String[] args) {
        
        counter c= new counter();
        ThreadImp t1 = new ThreadImp(c);
        ThreadImp t2 = new ThreadImp(c);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c.display();
    }

    
}
 