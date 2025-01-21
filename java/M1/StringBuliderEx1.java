
//String builder 
// public class StringBuliderEx1 {
//     public static void main(String[] args) {
        
//         StringBuilder sb1=new StringBuilder("Hello world");
//         System.out.println(sb1);
//         StringBuilder reverseSb=sb1.reverse();
//         System.out.println("Reverse String" +reverseSb);
//         System.out.println("Modified String BUilder = " +sb1);

//         StringBuilder sb2=new StringBuilder();   //will create an empty string builder
//         System.out.println("Capapcity of string builder = " +sb2.capacity());       //default capacity of String Builder is 16

//         //charAt() , indexOf() , length(), substring() , same as String

//         //int lastIndexOf(String Str);
//         //returns the index with this string of the right most occurencve of the specified substring

//         //int lastIndexOf(string str, int fromIndex)
//         //returns the index within this string of the lasr occurrence of the specified substring

//         //int lenght()
//         //String substring(int start)

//         // StringBuilder append(boolean); appends the string representation of the boolean argument
//         // StringBuilder.append(char c);
//         // StringBuilder.append(char[] str);
//         // StringBuilder.append(char[] str, int offset, int len);
//         // StringBuilder.append(double d);
//         // StringBuilder.append(float f);
//         // StringBuilder.append(int i);
//         // StringBuilder.append(long lng);
//         // StringBuilder.append(String str);


//         sb2.append("hello");
//         sb2.append(" ");
//         sb2.append("world");
//         System.out.println(sb2.toString());             //hello world
//         System.out.println(sb2);
//         StringBuilder sb22= new StringBuilder();        //will create new empty stringBuilder

//         sb22.append("hello").append(" ").append("World");           //method chaining, its allowed on string objects also
//         System.out.println(sb22);
//         sb2.insert(6, "beautiful");
//         System.out.println(sb2.toString());

//         StringBuilder sb3=new StringBuilder("he;;o world");
//         sb2.replace(1, 3, "java");
//         System.out.println("After replacement the string is = " +sb3.toString());           //o/p hjavalo

//         StringBuilder sb4=new StringBuilder("hello");
//         sb4.delete(1, 3);
//         System.out.println(sb4);        //prints hlo

//         StringBuilder sb5=new StringBuilder();
//         System.out.println(sb5.capacity());     //default 16
//         sb5.append("hello");        //still 16 cuz hello is less then 16 characters
//         System.out.println(sb5.capacity());     //16

//         sb5.append("Java is my fav lang aobjsfjsgnf");      
//         System.out.println(sb5.capacity());     //now more than 16
//         //(old capacity*2)+2   = 16*2)+2 = 34

//         sb5.ensureCapacity(10);     //will put the minimum capacity as 10 from 16, it will have no change
//         System.out.println(sb5.capacity());
//         sb5.ensureCapacity(50);     //now (34*2)+2
//         System.out.println(sb5.capacity());

//         StringBuilder sb6=new StringBuilder("hello");
//         System.out.println(sb6.charAt(1));  //will give e
//         System.out.println(sb6.length());
//         System.out.println(sb6.substring(1, 5));    //returns string ello
//         System.out.println(sb6.substring(1));   //returns ello
//     }
// }