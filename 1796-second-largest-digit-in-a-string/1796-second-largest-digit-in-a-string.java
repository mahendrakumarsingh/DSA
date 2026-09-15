class Solution {
    public int secondHighest(String s) {
        int large = -1,secondLargest = -1;
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                int n = c - '0';
                if(n > large){
                    secondLargest = large;
                    large = n;
                }
                else if(n < large && n > secondLargest){
                    secondLargest = n;
                }
                
            }
            
        }
        return secondLargest;
    }
}