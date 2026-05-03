class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()) return false;

        String temp=s;
        for(int i=0;i<s.length();i++){
            temp=temp.substring(1) + temp.charAt(0);
            if(temp.equals(goal)) return true;
        }
       

        return false;
    }
}