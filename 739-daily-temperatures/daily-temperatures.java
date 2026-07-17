class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();

        int res[] = new int[n];
        // int count = 0;
        for(int i = n - 1;i >= 0; i--){
            while(!stack.isEmpty() && temperatures[i] >= stack.peek()){
                stack.pop();
                // count--;
            }
            
            map.put(temperatures[i],i);
            res[i] = stack.isEmpty() ? 0 :  map.get(stack.peek()) - i;

            // count++;
            stack.push(temperatures[i]);
        }

        return res;
    }
}