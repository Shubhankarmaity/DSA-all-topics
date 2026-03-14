import java.util.*;

public class mergeSortedArr {
    public static ArrayList<Integer> mergeSorted(int[] num1, int[] num2) {
        int i = 0;
        int j = 0;
        int s1 = num1.length;
        int s2 = num2.length;
        ArrayList<Integer> newArr = new ArrayList<>();
        while (i < s1 && j < s2) {
            if (num1[i] > 0 && num2[j] > 0) {
                if (num1[i] <= num2[j]) {
                    newArr.add(num1[i]);
                    i++;
                } else {
                    newArr.add(num2[j]);
                    j++;
                }
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[]num1={1,2,3,0,0,0};
        int []num2={2,5,6};
        System.out.print(mergeSorted(num1,num2));
    }
}