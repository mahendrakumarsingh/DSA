class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int ans = 0;
        int i = 0,j = nums.length-1;
        int mid = i+j/2;
        while(i < mid && j>mid){
            if(nums[mid] == nums[i] || nums[mid] == nums[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
}