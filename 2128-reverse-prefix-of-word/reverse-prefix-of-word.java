class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        if(index==-1) return word;
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<=index;i++){
            stack.push(word.charAt(i));
            
        }
       StringBuilder str=new StringBuilder();
        while(!stack.isEmpty()){
            str.append(stack.pop());
        }
       str.append(word.substring(index+1));
        return str.toString();
    }
}