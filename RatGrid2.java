public class RatGrid2 {
    public static int ratGrid(int arr[][], int i, int j, int n, int m, boolean visited[][]) {

        // boundary check
        if (i < 0 || j < 0 || i >= n || j >= m) {
            return 0;
        }

        // blocked or already visited
        if (arr[i][j] == 0 || visited[i][j]) {
            return 0;
        }

        // destination reached
        if (i == n - 1 && j == m - 1) {
            return 1;
        }

        // mark visited
        visited[i][j] = true;

        int paths =
                ratGrid(arr, i + 1, j, n, m, visited) + // down
                ratGrid(arr, i - 1, j, n, m, visited) + // up
                ratGrid(arr, i, j + 1, n, m, visited) + // right
                ratGrid(arr, i, j - 1, n, m, visited);  // left

        // backtrack
        visited[i][j] = false;

        return paths;
    }

    public static void main(String[] args) {
        int arr[][] = {
            {1,1,1,1},
            {0,1,0,1},
            {1,1,1,1},
            {1,0,1,1}
        };

        boolean visited[][] = new boolean[4][4];
        System.out.println(ratGrid(arr, 0, 0, 4, 4, visited));
    }
}
