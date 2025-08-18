class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int count = 1;
        int minr = 0;
        int minc = 0;
        int maxr = n - 1;
        int maxc = n - 1;

        while (count <= n * n) {
            for (int c = minc; c <= maxc && count <= n * n; c++) {
                arr[minr][c] = count;
                count++;
            }
            for (int r = minr + 1; r <= maxr && count <= n * n; r++) {
                arr[r][maxc] = count;
                count++;
            }
            for (int c = maxc - 1; c >= minc && count <= n * n; c--) {
                arr[maxr][c] = count;
                count++;
            }
            for (int r = maxr - 1; r >= minr + 1 && count <= n * n; r--) {
                arr[r][minc] = count;
                count++;
            }

            maxc--;
            maxr--;
            minc++;
            minr++;
        }
        return arr;
    }
}
