public class DecimalToBinary {
    public static void BtD(int n) {
        int myNumber = n;
        int pow = 0;
        int binNum = 0;
        while (n > 0) {
            int lastDigit = n % 2;
            binNum = binNum + (lastDigit * (int) Math.pow(10, pow));
            pow++;
            n = n / 2;
        }
        System.out.println("Decimal of " + myNumber + " = " + binNum);
    }

    public static void main(String[] args) {
        BtD(5);
    }
}