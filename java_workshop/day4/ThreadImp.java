// package java_workshop.day4;

public class ThreadImp extends Thread {
    
    counter c1 =new counter();

    public ThreadImp(counter c1) {
        this.c1 = c1;
    }
    
    
    @Override
    public void run() {

        this.c1.increment();
        // c1.display();
       
        }
    }

    

