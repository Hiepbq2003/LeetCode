class Solution {
    public int climbStairs(int n) {
        //fibo num n = n-1 + n-2
        int cur = 0;
        int n1 = 3 ;
        int n2 = 2;
        if(n <= 3) return n;
        for(int i = 4 ; i <=n ; i++){
            cur = n1 + n2;
            n2 = n1;
            n1 = cur;  
        }
        return n1;
    }
}