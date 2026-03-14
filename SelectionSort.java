import java.util.Arrays;

public class SelectionSort{

    public static int[] selectionSort(int arr[]){
        int n=arr.length;

        for(int i=0;i<n-1;i++){
            int minPos=i;
            for(int j=i+1;j<n-1;j++){
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //Swap
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        System.out.print(Arrays.toString(selectionSort(arr)));
    }
}