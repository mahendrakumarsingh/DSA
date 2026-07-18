class Solution {
    public int maxVowels(String s, int k) {
        int l = 0,r = 0,count = 0,maxCount = 0;
        while(r < k){
            if(isVowel(s.charAt(r))){
            count++;
            }
            r++;
        }
        maxCount = count;
        while(r < s.length()){
            if(isVowel(s.charAt(r)))
            count++;
            if(isVowel(s.charAt(l)))
            count--;

            l++;
            r++;
            maxCount = Math.max(maxCount , count);
        }
        return maxCount;
    }    
    private boolean isVowel(char c){
        return c == 'a' ||c == 'e' ||c =='i' ||c =='o' ||c =='u';
    }
}