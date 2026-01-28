class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int l = s.length();
        for(int i = 1 ; i <= l / 2 ; i++){
            if(l % i != 0 ) continue;
             String sub = s.substring(0,i);
             if(checkRepeat(s,sub)){
                return true;
             }
        }
        return false;
    }
    public boolean checkRepeat(String s , String sub){
        StringBuilder sb = new StringBuilder();
        int times = s.length() / sub.length();
        for(int i = 0 ; i < times ; i++){
            sb.append(sub);
        }
        return sb.toString().equals(s);
    }
}