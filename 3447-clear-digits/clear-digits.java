class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        for(char i:s.toCharArray()){
            if(Character.isDigit(i)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(i);
                
            }
        }
        StringBuilder str=new StringBuilder();
        for(char st:stack) str.append(st);

        return str.toString();
    }
}