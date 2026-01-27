class Solution {
    public boolean wordPattern(String pattern, String s) {
        String word[] = s.split(" ");
        if(word.length != pattern.length()) return false;

        Map<Character,String> m1 = new HashMap<>();
        Map<String,Character> m2 = new HashMap<>();

        for(int i = 0 ; i < word.length ; i ++){
            char c = pattern.charAt(i);
            String w = word[i];
            if(m1.containsKey(c)){
                if(!m1.get(c).equals(w)) return false;
            }
            else{
                m1.put(c,w);
            }
            if(m2.containsKey(w)){
                if(!m2.get(w).equals(c)) return false;
            }
            else{
                m2.put(w,c);
            }
        }
        return true;
    }
}