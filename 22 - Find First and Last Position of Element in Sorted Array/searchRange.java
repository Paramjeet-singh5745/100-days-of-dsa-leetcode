class Solution {

    public int firstOccur(int [] arr,int target){
        int st=0;
        int end=arr.length-1;
        int ans=-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==target){
                ans=mid;
                end=mid-1;
            }
            else if(target>arr[mid]){
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
    public int secondoccur(int [] arr,int target){
    int st=0;
    int end=arr.length-1;
    int ans=-1;
    while(st<=end){
        int mid=(st+end)/2;
        if(arr[mid]==target){
            ans=mid;
            st=mid+1;
        }
        else if(target>arr[mid]){
            st=mid+1;
        }
        else{
            end=mid-1;
        }
    }
    return ans;
}
    public int[] searchRange(int[] nums, int target) {
        int [] ans={-1,-1};
        if(nums.length==0){
            return ans;
        }
        
        ans[0]=firstOccur(nums,target);
        ans[1]=secondoccur(nums,target);
        return ans;
    }
}
