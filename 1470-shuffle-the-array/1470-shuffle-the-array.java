class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int [2 * n];
        int j = n;
        int i = 0;
        int k = 0;
        while(i < nums.length){
            if(i % 2 == 0){
                arr[i] = nums[k];
                k++;
            }
            else{
                arr[i] = nums[j];
                j++;
            }
            i++;
        }
        return arr;
    }
}