class Solution {
    public int search(int[] nums, int target) {
        int n =nums.length;
        int low = 0,high =n-1, index = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if (nums[mid] > target)
                high = mid - 1;
            else if(nums[mid] < target)
                low = mid + 1;
            else{
                index = mid;
                high = mid - 1;
            }
            
        } 
        return index;
    }
}