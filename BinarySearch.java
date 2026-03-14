public class BinarySearch{
    public static int BinSearch(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr1[]={2,4,6,8,10,12,14};
        System.out.println("Binary search key is in :"+BinSearch(arr1, 10));
    }
}