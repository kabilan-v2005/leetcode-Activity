class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String c:operations){
           if(c.equals("C")){
            stack.pop();
           }
           else if(c.equals("D")){
            stack.push(stack.peek()*2);
           }
           else if(c.equals("+")){
            int top=stack.pop();
            int s=top+stack.peek();
            stack.push(top);
            stack.push(s);
           }
           else{
            stack.push(Integer.parseInt(c));
           }
        }
        int sum=0;
        for(int n:stack){
           sum+=n; 
        }
        return sum;
    }
}