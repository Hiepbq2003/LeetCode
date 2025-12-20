class Solution {
    public int strStr(String haystack, String needle) {
        int haylength = haystack.length();
        int needlength = needle.length();

        for(int i = 0 ; i <= haylength - needlength ; i++){
            if(haystack.substring(i , i + needlength).equals(needle))
            return i;
        }
        return -1;
    }
}