public class fibonacci {
    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = fibo(n - 1);
        int fnm2 = fibo(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static boolean isSorted(int arr[], int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    // find key
    public static int FirstOccurence(int arr[], int key, int i) {

        if (key == arr[i]) {
            return i;
        }
        if (i == arr.length) {
            return -1;
        }
        return FirstOccurence(arr, key, i + 1);
    }

    public static int LastOccurence(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isFound = LastOccurence(arr, key, i + 1);
        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static int pow(int x, int n) {

        if (n == 0) {
            return 1;
        }
        int xnm1 = pow(x, n - 1);
        int xn = x * xnm1;
        return xn;
    }

    public static void main(String[] args) {
        // int n = 25;
        // int arr[] = { 1, 2, 3, 4, 5, 2 };
        // System.out.print(fibo(n));
        // System.out.print(isSorted(arr, 0));
        // System.out.print(FirstOccurence(arr, 5, 0));
        // System.out.print(LastOccurence(arr, 2, 0));
        System.out.print(pow(5, 2));
    }
}
