class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> rs = new ArrayList<>();
        int tarindex = 0;
        for(int i = 1 ; i <= n && tarindex < target.length; i ++ ){
            rs.add("Push");
            if(i == target[tarindex]){
                tarindex ++;
            }
            else{
                rs.add("Pop");
            }
        }
        return rs;
    }
}