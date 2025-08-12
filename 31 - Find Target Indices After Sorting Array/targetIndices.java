class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int count=0;
        int ntarget=0;

        for(int ele:nums){
            if(ele==target){
                count++;
            }
            else if(ele<target){
                ntarget++;
            }
        }

        List<Integer> ans=new ArrayList<>();

        while(count>0){
            ans.add(ntarget);
            ntarget++;
            count--;
        }

        return ans;
    }
}
