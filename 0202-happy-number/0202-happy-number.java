class Solution {
    public boolean isHappy(int n) {
        Set<Integer> daGap = new HashSet<>();
        while(n != 1 && !daGap.contains(n)){
            daGap.add(n);
            n = Square(n);
        }
        return n == 1;
    }
     public int Square(int t){
            int total = 0;
            while(t>0){
                int d = t % 10;
                total += d * d;
                t = t/10;  
            }
            return total;
        }
}