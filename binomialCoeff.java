import java.util.Scanner;

public class binomialCoeff {
    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public static int bincoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int bincoeff = fact_n / (fact_r * fact_nmr);
        return bincoeff;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n = sc.nextInt();
        System.out.println("enter the value of r:");
        int r = sc.nextInt();
        System.out.println("Binomial Coefficient (nCr) = " + bincoeff(n, r));
    }
}