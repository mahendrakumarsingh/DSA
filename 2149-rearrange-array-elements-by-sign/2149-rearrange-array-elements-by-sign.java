class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positiveIndex = 0, negativeIndex = 1;
        int[] ans = new int[nums.length];
        for(int num : nums){
            if(num > 0){
                ans[positiveIndex] = num;
                positiveIndex += 2;
            }
            else{
                ans[negativeIndex] = num;
                negativeIndex += 2;
            }
        }
        return ans;
    }
}