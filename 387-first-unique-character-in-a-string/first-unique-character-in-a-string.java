class Solution {
    public int firstUniqChar(String s) {
        // int i=0;
        for(int i = 0;i < s.length();i++){
            boolean b = true;
            for(int j=0;j < s.length();j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    b = false;
                    break;
                }
            }
            if(b) return i;
        }
        return -1;
    }
}