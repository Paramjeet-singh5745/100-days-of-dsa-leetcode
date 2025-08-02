class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        
        int ft = 0;
        int st = 1;
        int th = 1;
        for (int i = 1; i <= n; i++) {
            int f4 = ft + st + th;
            ft = st;
            st = th;
            th = f4;
        }

        return ft;
    }
}
