import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter a number:");
            int num = sc.nextInt();
            int fact = 1;
            for (int i = num-1; i > 0; i--) {
                fact += fact * i;
            }
            System.out.println("Factorial is:" + fact);
        } while (true);
    }
}
