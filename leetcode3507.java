public class leetcode3507 {
    public static int minimumPairRemoval(int[] nums) {
        int count = 0;
        if (isSort(nums)) {
            return count;
        } else {
            int min = 0;
            int pos = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                int val = nums[i] + nums[i + 1];
                int newMin = Math.min(min, val);
                if (min != newMin) {
                    pos = i;
                }
                min = newMin;
            }
            nums[pos] = min;
            count++;
            minimumPairRemoval(nums);
        }
        return count;
    }

    public static boolean isSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int []nums={5,3,2,1};
        System.out.println(minimumPairRemoval(nums));
    }
}