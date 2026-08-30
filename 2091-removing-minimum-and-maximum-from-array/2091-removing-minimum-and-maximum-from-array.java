class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minVal = nums[0], maxVal = nums[0];
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
                minIndex = i;
            }
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxIndex = i;
            }
        }
        int front = Math.max(minIndex, maxIndex) + 1;
        int back = n - Math.min(minIndex, maxIndex);
        int mix = Math.min(minIndex, maxIndex) + 1 + (n - Math.max(minIndex, maxIndex));

        return Math.min(front, Math.min(back, mix));
    }
}
