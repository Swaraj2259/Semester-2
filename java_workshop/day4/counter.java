// package java_workshop.day4;

public class counter {

    int count = 0;

    public void increment() {
        for (int i = 0; i< 1000 ; i++) {
            count++;
        }

    }
    public void display() {
        System.out.println("The count is: " + count);
    }
}
