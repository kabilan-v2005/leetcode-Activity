class Solution {
    public String reverseWords(String s) {
        StringBuilder str=new StringBuilder();
        StringBuilder word=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                word.append(s.charAt(i));
            }
            else if(word.length()>0){
                str.append(word.reverse()).append(" ");
                word.setLength(0);
            }
        }
        if(word.length()>0){
            str.append(word.reverse());
        }
        return str.toString().trim();
    }
}