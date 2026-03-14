import java.util.*;
public class CWMW {
    
    // public static int storeWater(ArrayList<Integer> height){
    //     int max_water=0;
    //     for(int i=0;i<height.size();i++){
    //         for(int j=i+1;j<height.size();j++){
    //             int ht=Math.min(height.get(i), height.get(j));
    //             int wt=j-i;
    //             int water=ht*wt;
    //             max_water=Math.max(max_water, water);
    //         }
    //     }
    //     return max_water;
    // }

    //2 pointer approach
    public static int storeWater(ArrayList<Integer> height){
        int max_water=0;
        int lp=0;
        int rp=height.size()-1;

        while (lp<rp) {
            int ht=Math.min(height.get(lp), height.get(rp));
            int wt=rp-lp;
            int water=ht*wt;
            max_water=Math.max(max_water, water);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }
            else{
                rp--;
            }
        }
        return max_water;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height=new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(2);
        System.out.print(storeWater(height));
    }
}
