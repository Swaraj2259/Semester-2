import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Squares extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Squares are : "+(i*i));
        }
    }
}

public class SquaresImp{     //the class that has the main function has to be declared as public
    public static void main(String[] args) {
        Squares s1=new Squares();
        ExecutorService es=Executors.newFixedThreadPool(3);

        es.execute(s1);
    }
}