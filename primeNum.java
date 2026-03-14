import java.util.Scanner;
public class primeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("enter a number:");
            int num=sc.nextInt();
            if(num%2==0 && num>0){
                System.out.println("Not a Prime Number");
            }
            else{
                System.out.println("Prime number");
            }
        }while(true);
    }
}
