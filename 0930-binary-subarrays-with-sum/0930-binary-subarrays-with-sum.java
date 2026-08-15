class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> freq = new HashMap<>();
        freq.put(0, 1); 
        
        int sum = 0, count = 0;
        
        for (int num : nums) {
            sum += num;
            
            if (freq.containsKey(sum - goal)) {
                count += freq.get(sum - goal);
            }
            
            freq.put(sum, freq.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
