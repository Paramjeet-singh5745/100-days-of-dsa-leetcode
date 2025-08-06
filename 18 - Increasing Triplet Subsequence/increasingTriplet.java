class Solution {
    public boolean increasingTriplet(int[] nums) {
        int ft=Integer.MAX_VALUE;
        int sc=Integer.MAX_VALUE;
        int th=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++){
            int ele=nums[i];

            if(ft>=ele){
                ft=ele;
            }
            else if(sc>=ele){
                sc=ele;
            }
            else{
                th=ele;
                return true;
            }
        }
        return false;
    }
}
