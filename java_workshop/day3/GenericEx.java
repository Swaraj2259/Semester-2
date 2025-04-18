class DisplayValues <T> {
      T num;

        public DisplayValues(T num) {
                this.num = num;
        }

        public void display() {
                System.out.println("The number is: " + num);
        }
    }
// class DisplayDouble {
//         Double num;

//         public DisplayDouble(Double num) {
//                 this.num = num;
//         }

//         public void display() {
//                 System.out.println("The number is: " + num);
//         }
// }
public class GenericEx{
        public static void main(String[] args) {
                DisplayValues<Integer> i = new DisplayValues<>(10);
                i.display();
                // DisplayDouble d = new DisplayDouble(10.5);
                // d.displa y();
                DisplayValues<Double> d = new DisplayValues<>(10.5);
                d.display();
        }
}
