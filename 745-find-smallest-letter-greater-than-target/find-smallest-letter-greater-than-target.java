class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char res=letters[0];
        for(int i=0;i<letters.length;i++){
            if(letters[i]>target){
                res=letters[i];
                break;
            }
        }
        return res;
    }
}