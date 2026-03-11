class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       Set<Integer> save = new HashSet<>();
       for(int num1 : nums1){
            save.add(num1);
       } 
       Set<Integer> intersect = new HashSet<>();
       for(int check : nums2){
            if(save.contains(check)){
                intersect.add(check);
            }
       }
       int[] result = new int[intersect.size()];
       int i = 0;
       for(int num : intersect){
            result[i++] = num;
       } 
       return result;
    }
}