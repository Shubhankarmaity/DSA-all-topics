import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class generateMatrix {
    public static int[][] GenerateMatrix(int n) {

        int startRow = 0;
        int startCol = 0;
        int endRow = n - 1;
        int endCol = n - 1;
        int num = 1;
        int matrix[][] = new int[n][n];

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                matrix[startRow][j] = num;
                num++;
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                matrix[i][endCol] = num;
                num++;
            }
            // buttom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startRow == endRow) {
                    break;
                }
                matrix[endRow][j] = num;
                num++;
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startCol == endCol) {
                    break;
                }
                matrix[i][startCol] = num;
                num++;
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(GenerateMatrix(3)));
    }
}