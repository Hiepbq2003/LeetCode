class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i = 0 ; i < ransomNote.length() ; i++){
            int charNote = ransomNote.charAt(i);
            int viTri = magazine.indexOf(charNote);

            if(viTri == -1){
                return false;
            }

            magazine = magazine.substring(0,viTri) + magazine.substring(viTri +1);
        }
        return true;
    }
}