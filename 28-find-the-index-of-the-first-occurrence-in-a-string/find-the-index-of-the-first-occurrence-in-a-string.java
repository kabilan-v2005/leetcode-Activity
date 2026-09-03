class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0;i <= haystack.length()-needle.length();i++){
            boolean b = true;
            for(int j = 0;j < needle.length();j++){
                if(haystack.charAt(i + j) != needle.charAt(j)){
                    b = false;
                    break;
                }
            }
            if(b){
                return i;
            }
        }
        return -1;
    }
}