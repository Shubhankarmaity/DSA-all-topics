class practice{

    public static int printN(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return printN(n-2)+printN(n-1);
    }
    public static int lastOccurance(int []arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return lastOccurance(arr, key, i-1);
    }
    public static void main(String[] args) {
        
        System.out.println(printN(6));
        int []arr={1,2,3,5,6,3,4,5};
        System.out.println(lastOccurance(arr, 3, arr.length-1));
    }
}