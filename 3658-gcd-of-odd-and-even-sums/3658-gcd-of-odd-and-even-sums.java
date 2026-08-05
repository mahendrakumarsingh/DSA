class Solution {
    public int gcdOfOddEvenSums(int n) {
        if (n == 1) return n;
        int sumOdd = n*n;
        int sumEven = n * (n+1);
        while(sumEven != 0){
            int temp = sumEven;
            sumEven = sumEven % sumOdd;
            sumOdd = temp;
        }
        return sumOdd;
    }
}