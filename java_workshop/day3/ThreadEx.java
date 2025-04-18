public class ThreadEx extends Thread {
//we can create a thread by 2 method
//by extending Thread class
//by implementing Runnable interface 
        @Override
        public void run() {
            System.out.println("Thread is running");
        }  
    

    public static void main(String[] args) {
        ThreadEx t1 = new ThreadEx();
        t1.start();
    }
}

