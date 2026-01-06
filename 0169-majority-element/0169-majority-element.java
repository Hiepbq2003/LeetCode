class Solution {
    public int majorityElement(int[] nums) {
    HashMap<Integer , Integer> count = new  HashMap<Integer , Integer>();
      for(int x : nums){
       int current = count.getOrDefault(x,0) +1;
       count.put(x,current);
       if(current > nums.length/2)
       return x;
      }  
      return 0;
    }
}