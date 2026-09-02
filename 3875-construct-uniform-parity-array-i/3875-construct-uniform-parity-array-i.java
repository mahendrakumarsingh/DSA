class Solution {
    public boolean uniformArray(int[] nums1) {
        for(int nums : nums1){
            if(nums % 2 == 1)
            return true;
        }
        return true;
    }
}