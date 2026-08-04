class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> missing = new ArrayList<>();
        int min = nums[0];
        int max = nums[nums.length - 1];
        
        for (int i = min; i <= max; i++) {
            if (Arrays.binarySearch(nums, i) < 0) {
                missing.add(i);
            }
        }
        return missing;
    }
}