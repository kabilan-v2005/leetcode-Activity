class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack=new Stack<>();
        int c=0;
        for(char i:s.toCharArray()){
            if(Character.isDigit(i)){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(i);
                c++;
            }
        }
        StringBuilder str=new StringBuilder();
        for(char st:stack) str.append(st);

        return str.toString();
    }
}