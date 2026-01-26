class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length() || s == null || t == null){
            return false;
        }
        HashMap<Character , Character> m1 = new HashMap<>();
        HashMap<Character , Character> m2 = new HashMap<>();

        for(int i = 0 ; i < s.length() ; i++){
            char kituS = s.charAt(i);
            char kituT = t.charAt(i);

            if(m1.containsKey(kituS)){
                if(m1.get(kituS) != kituT) return false;
            }
            else{
                m1.put(kituS , kituT);
            }

            if(m2.containsKey(kituT)){
                if(m2.get(kituT) != kituS) return false;
            }
            else{
                m2.put(kituT , kituS);
            }
        }
        return true;
    }
}