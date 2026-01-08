class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> tria = new ArrayList<>();
        if(numRows == 0) return tria;

        for(int i = 0 ; i < numRows ; i++){
            List<Integer> row = new ArrayList<>(); 
            for(int j = 0 ; j <= i; j++ ){
                if(j == 0 || j == i )
                row.add(1);
                else{
                    int num = tria.get(i - 1).get(j - 1) + tria.get(i - 1).get(j);
                    row.add(num);
                }
            }
            tria.add(row);
        }
        return tria;
    }
}