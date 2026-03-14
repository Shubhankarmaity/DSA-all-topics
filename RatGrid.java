public class RatGrid {
    

    public static int ratGrid(int arr[][],int i,int j,int n,int m){

        //base case
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==m){
            return 0;
        }

        if(arr[i][j]==0){
            ratGrid(arr, i, j+1, n, m);
        }
        //for left visit
        int w1=ratGrid(arr, i, j-1, n, m);
        //for right visit
        int w2=ratGrid(arr, i, j+1, n, m);
        //for up visit
        int w3=ratGrid(arr, i-1, j, n, m);
        //for down visit
        int w4=ratGrid(arr, i+1, j, n, m);

        return w1+w2+w3+w4;
    }

    public static void main(String[] args) {
        int arr[][]={
            {1,1,1,1},
            {0,1,0,1},
            {1,1,1,1},
            {1,0,1,1}
        };
        System.out.print(ratGrid(arr, 0, 0, 4, 4));
    }
}
