// Last updated: 8/3/2025, 8:39:08 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        boolean zeroRow[] = new boolean[m];
        boolean zeroCol[] = new boolean[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // setRow(matrix, i, 0);
                    // setCol(matrix, j, 0);
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }

        for(int i = 0; i < m; i++) {
            if (zeroRow[i]) {
                for(int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < n; i++) {
            if (zeroCol[i]) {
                for(int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }
}
      