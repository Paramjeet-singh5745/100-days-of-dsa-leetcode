class Solution {
    public int maximumCount(int[] nums) {

        int lastn=lastneg(nums)+1;
        int firstpo=nums.length-firstpos(nums);
        return Math.max(lastn,firstpo);
    }

    public int lastneg(int[] nums){
        int st=0;
     int end=nums.length-1;
     int ans=-1;
     while(st<=end){
        int mid=(end+st)/2;

        if(nums[mid]<0){
            ans=mid;
            st=mid+1;
        }
        else{
            end=mid-1;
        }
     }   

     return ans;
    }
    public int firstpos(int[] nums){
     int st=0;
     int end=nums.length-1;
     int ans=nums.length;
     while(st<=end){
        int mid=(end+st)/2;

        if(nums[mid]>0){
            ans=mid;
            end=mid-1;
        }
        else{
            st=mid+1;
        }
     }   

     return ans;
    }
}
