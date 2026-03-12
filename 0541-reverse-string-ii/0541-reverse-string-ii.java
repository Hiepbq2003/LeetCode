class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder rs = new StringBuilder();

        for(int i = 0 ; i < s.length(); i += 2 * k){
            int end1 = Math.min(i + k , s.length());
            String s1 = s.substring(i , end1);
            rs.append(new StringBuilder(s1).reverse());

            int end2 = Math.min(i + 2 * k , s.length());
            if(i + k < s.length()){
                String s2 = s.substring(i + k , end2);
                rs.append(s2);
            }
        }    
        return rs.toString();
    }
}