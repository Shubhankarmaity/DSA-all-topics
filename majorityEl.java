import java.util.*;

public class majorityEl {
    public static void majorEl(int nums[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 1);
            }
        }
        Set<Integer> keySet = hm.keySet();
        for (Integer key : keySet) { //also we can use the hm.keySet directly wirhout use the upper lines
            if (hm.get(key) > n / 3) {
                System.out.print(key + " ");
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2 };
        majorEl(nums);
    }
}
