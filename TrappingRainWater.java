
public class TrappingRainWater {

    public static void TrappedWater(int height[]) {
        int n = height.length;
        int LMB[] = new int[n];
        int RMB[] = new int[n];
        int TrappedWater=0;
        //calculating the left max boundary array
        LMB[0] = height[0];
        for (int i = 1; i < LMB.length; i++) {
            LMB[i] = Math.max(LMB[i - 1], height[i]);
        }
        //calculating the right max boundary array
        RMB[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            RMB[i] = Math.max(RMB[i + 1], height[i]);
        }
        ////calculating the water level and assign to the trapped variavle
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(LMB[i],RMB[i]);
            TrappedWater+= waterLevel-height[i];
        }
        System.out.print(TrappedWater);

    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        TrappedWater(height);
    }
}
