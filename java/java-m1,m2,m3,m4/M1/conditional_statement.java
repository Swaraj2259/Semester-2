// //labelled break statement
// class conditional_statement
// {
//     public static void main(String args[])
//     {
//         int i,j;
//         outer:for(i=1;i<5;i++)
//         {
//             inner:for(j=1;j<3;j++)
//             {
//                 System.out.println("i="+i+" j="+j);
//                 if(i==2)
//                  break outer;

//             }
//         }
//     }
// }
//labelled break statement
// class conditional_statement
// {
//     public static void main(String args[])
//     {
//         int i,j;
//         for(i=1;i<5;i++)
//         {
//             for(j=1;j<3;j++)
//             {
//                 System.out.println("i="+i+" j="+j);
//                 if(i==2)
//                  break ;
//             }
//         }
//     }
// }
// //java program to demonstrate the use of continue statement inside the for loop
// class conditional_statement
// {
//     public static void main(String args[])
//     {
//         for (int i=1;i<=10;i++)
//         {
//             if(i==5)
//             {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }
// example of return statement
class conditional_statement {

    public static void main(String args[]) {
        //first labelled 
        first:
        for (int i = 0; i < 3; i++) {
            //second labelled
            second:
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    continue first;
                }
                System.out.println("i=" + i + " j=" + j);
            }
        }
    }

}
 