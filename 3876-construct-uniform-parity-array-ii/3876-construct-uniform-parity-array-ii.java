class Solution {

    public boolean uniformArray(int[] nums1) {
        int temp = nums1[0];
        boolean hasOdd = false;
        for (int num : nums1) {
            if (num < temp) {
                temp = num;
            }
            if ((num & 1) == 1) {
                hasOdd = true;
            }
        }
        if ((temp & 1) == 1) {
            return true;
        }
        return !hasOdd;
    }
}