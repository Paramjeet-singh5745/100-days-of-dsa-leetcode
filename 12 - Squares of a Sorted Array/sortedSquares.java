class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int st = 0;
        int end = nums.length - 1;

        int pt = ans.length - 1;
        while (st <= end) {
            int ss = nums[st] * nums[st];
            int es = nums[end] * nums[end];

            if (ss > es) {
                ans[pt] = ss;
                st++;
            } else {
                ans[pt] = es;
                end--;
            }
            pt--;
        }
        return ans;
    }
}
