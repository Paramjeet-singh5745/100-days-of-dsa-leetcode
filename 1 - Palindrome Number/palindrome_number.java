class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int pal = 0;
        while (n > 0) {
            int d = n % 10;
            pal = pal * 10 + d;
            n = n / 10;
        }

        if (pal == x) {
            return true;
        } else {
            return false;
        }
    }
}
