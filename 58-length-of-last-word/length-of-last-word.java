class Solution {
    public int lengthOfLastWord(String s) {
        
        int count=0;
        boolean b = false;
        
        for(int i=s.length() - 1;i>=0;i--){
            if(s.charAt(i) != ' '){
                count++;
                b = true;     
            }
            
            if(b && s.charAt(i) == ' ') break;
            
        }
        return count;
    }
}