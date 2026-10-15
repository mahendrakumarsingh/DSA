class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = n * (n+1) /2;
        
        for(int temp : nums){
            ans -= temp;
        }
        return ans;
    }
}