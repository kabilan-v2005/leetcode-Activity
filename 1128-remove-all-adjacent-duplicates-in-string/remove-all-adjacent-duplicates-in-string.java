class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        int n = s.length();
        stack.push(s.charAt(0));
        for(int i = 1;i < n;i++){
            char ch = s.charAt(i);
            // if(!stack.isEmpty())
            if(!stack.isEmpty() && stack.peek() == ch){
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }

        StringBuilder str = new StringBuilder();
        while(!stack.isEmpty())
            str.insert(0,stack.pop());
        

        return str.toString();
    }
}