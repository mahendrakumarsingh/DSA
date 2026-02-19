class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int n = nums.length;
        int l =0,h=n-1,idx = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]<target) l = mid+1;
            else if(nums[mid]>target) h = mid-1;
            else{
                idx = mid;
                h = mid - 1;
            } 
        }
        ans[0]=idx;

        l =0;h=n-1;idx = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(nums[mid]<target) l = mid+1;
            else if(nums[mid]>target) h = mid-1;
            else{
                idx = mid;
                l = mid + 1;
            }
        }     
        ans[1]=idx;
        return ans;
        
    }
}