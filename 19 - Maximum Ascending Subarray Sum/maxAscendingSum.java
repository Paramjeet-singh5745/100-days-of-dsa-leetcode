
class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int curr=nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                curr=curr+nums[i];
            }
            else{
                max=Math.max(curr,max);
                curr=nums[i];
            }
        }
        max=Math.max(curr,max);
        return max;
    }
}
