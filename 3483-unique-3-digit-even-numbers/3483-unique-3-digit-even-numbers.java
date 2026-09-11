
class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> result = new HashSet<>();
        
        for (int num = 100; num <= 999; num++) {
       
            if (num % 2 != 0) continue;
            
            int[] freq = new int[10];
            int temp = num;
            int[] numDigits = new int[3];
            for (int i = 2; i >= 0; i--) {
                numDigits[i] = temp % 10;
                temp /= 10;
            }
            for (int d : numDigits) freq[d]++;
            
            int[] inputFreq = new int[10];
            for (int d : digits) inputFreq[d]++;
            
            boolean valid = true;
            for (int d = 0; d < 10; d++) {
                if (freq[d] > inputFreq[d]) {
                    valid = false;
                    break;
                }
            }
            
            if (valid) result.add(num);
        }
        
        return result.size();
    }
}
