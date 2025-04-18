class ThreadEx2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}


public class ThreadEx02 {
    public static void main(String[] args) {
        ThreadEx2 t1 = new ThreadEx2();
        Thread t2 = new Thread(t1);
        t2.start();
    }

}
