package chapter_1;

public class RotateMatrix {

    public boolean solve(int[][] matrix) {

        /*
         * time - O(n*n)
         * space - O(1)
         * */
        int N = matrix.length;

        if (N == 0) {
            return false;
        }

        for (int i = 0; i < N / 2; i++) {
            for (int j = i; j < (N - 1 - i); j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[N - j - 1][i];
                matrix[N - j - 1][i] = matrix[N - i - 1][N - j - 1];
                matrix[N - i - 1][N - j - 1] = matrix[j][N - i - 1];
                matrix[j][N - i - 1] = temp;
            }
        }

        return true;
    }

}
