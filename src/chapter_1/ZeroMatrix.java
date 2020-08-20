package chapter_1;

public class ZeroMatrix {
    /*
     * time - O(n*m)
     * space - O(n)
     * */
    public void solve(int[][] matrix) {
        int N = matrix.length;
        int M = matrix[0].length;

        boolean[] rows = new boolean[N];
        boolean[] columns = new boolean[M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        for (int i = 0; i < rows.length; i++) {
            if (rows[i]) {
                for (int j = 0; j < M; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < columns.length; i++) {
            if (columns[i]) {
                for (int j = 0; j < N; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
