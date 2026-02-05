class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int save[] = new int[nums.length + 1];
        for(int x : nums){
            save[x] ++;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (save[i] == 0) {
                result.add(i);
            }
        }

        return result;

    }
}