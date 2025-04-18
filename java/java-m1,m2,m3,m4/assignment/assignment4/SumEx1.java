// Q8. Create a SumEx1class and overload sum() method for:
// • two integers
// • three integers
// • two double
// • three double
class sum {
    public sum(){
        System.out.println("defult");
    }
    public sum(int x,int y){
        System.out.println("sum of 2 int is:"+ (x + y));

    }
    public sum(int x,int y,int z){
        System.out.println("sum of three integers is :"+(x+y+z));
    }
    public sum(double x,double y){
     System.out.println("sum of 2 double is:"+ (x + y));
    }
    public sum(double x,double y,double z){
        System.out.println("sum of three double is :"+(x+y+z));
    }    
}
@SuppressWarnings("unused")
class SumEx1 {
    public static void main(String[] args) {
        sum cd =new sum (33.3,44.5);

    }
}