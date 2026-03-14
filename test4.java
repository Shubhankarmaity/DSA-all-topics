

import java.util.*;
class test4 {
    public static int countResponseTimeRegressions(ArrayList<Integer> responseTimes) {
        int avg=0;
        int count=0;
        int sum=0;
        int i=0;
        while(i<responseTimes.size()){
            sum+=responseTimes.get(i);
            if(i==0){
                i++;
                continue;
            }
            if(avg<responseTimes.get(i)){
                count++;
            }
            avg=sum/i+1;
            i++;
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(100);
        arr.add(200);
        arr.add(150);
        arr.add(300);
        System.out.print(countResponseTimeRegressions(arr));
    }
}