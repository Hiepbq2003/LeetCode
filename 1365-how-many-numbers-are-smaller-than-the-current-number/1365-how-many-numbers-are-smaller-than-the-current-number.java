class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length - 1;
        int count[] = new int [nums.length];
         for(int i = 0 ; i <= n ; i++){
            int countArr = 0;
            for(int j = 0 ; j <=n ; j++){
                if(nums[i] != nums[j] && nums[j] < nums[i]){
                    countArr ++;
            }
         }
        count[i] = countArr;
    }
    return count;
}}