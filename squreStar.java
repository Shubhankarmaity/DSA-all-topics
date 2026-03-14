
// public class squreStar {
//     public static void main(String[] args) {
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n;j++){
//                 if(i==1){
//                     System.out.print("*");
//                 }
//                 else if(i==n){
//                     System.out.print("*");
//                 }
//                 else if(i>1 &&i<n){
//                     if(j==1){
//                         System.out.print("*");
//                     }
//                     else if(j==n){
//                         System.out.print("*");
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


//Alternative method

import java.util.Scanner;

public class squreStar {

    public static void rect_star(int row,int col){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                if(i==1||j==1||i==row||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows: ");
        int row=sc.nextInt();
        System.out.print("enter the number of coloms ");
        int col=sc.nextInt();
        rect_star(row,col);
    }
}