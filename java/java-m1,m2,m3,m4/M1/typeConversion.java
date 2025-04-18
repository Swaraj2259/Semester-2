// class typeconversion
// {
//     public static void main(String[] args)
//     {
//         int i = 100;
//         long l = i; //no explicit type casting required
//         float f = l; //no explicit type casting required
//         System.out.println("Int value "+i);
//         System.out.println("Long value "+l);
//         System.out.println("Float value "+f);
//     }
// }
class typeConversion{
    public static void main(String[] args) {
        int i = 100;
        
        long l = i;
        // automatic type conversion
        float f= l;
        // automatic type conversion
        System.out.println("Int value "+i);
        System.out.println("Long value "+l);
        System.out.println("Float value "+f);

    }
}