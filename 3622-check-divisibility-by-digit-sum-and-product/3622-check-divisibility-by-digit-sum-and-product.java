class Solution {
    public boolean checkDivisibility(int n) {
        int temp = 0;
        int sum = 0;
        int multiply = 1;
        int orignal = n;
        while(n != 0){
            int a = n %10;
            sum += a;
            multiply *= a;
            temp = temp * 10 + a;
            n = n /10;
        }
        if (orignal % (sum+multiply) ==0) return true;
        else return false;
    }
}