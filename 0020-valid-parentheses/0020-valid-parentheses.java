class Solution {
    public boolean isValid(String s) {
        Map <Character , Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        
        Stack<Character> tack = new Stack<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c))
            tack.push(c);
            else{
                if(tack.isEmpty()) return false;
                char mo = tack.pop();
                if(map.get(mo) != c) return false;
            }
        }
        return tack.isEmpty();
    }
}