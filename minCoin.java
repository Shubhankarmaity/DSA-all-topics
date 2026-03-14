import java.util.ArrayList;

public class minCoin {
    public static int minIndCoin(int arr[],int v){
        ArrayList<Integer> arrList=new ArrayList<>();
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            if(v>=arr[i]){
                v=v-arr[i];
                arrList.add(arr[i]);
                i=i+1;
                count++;
            }
        }
        System.out.println(arrList);
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,10,20,50,100,500,2000};
        int v=590;
        System.out.print(minIndCoin(arr, v));
    }
}
