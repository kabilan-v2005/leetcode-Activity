class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder str=new StringBuilder();
        int count=0;
        for(int i=0;i<s.length();i++){
            
            if(s.charAt(i)==' ') count++;
            
            if(count == k) break;
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}