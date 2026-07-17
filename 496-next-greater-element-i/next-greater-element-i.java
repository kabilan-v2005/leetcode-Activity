class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        // stack.push(nums2[n - 1]);
        int arr[] = new int[nums1.length];
        // arr[n - 1] = -1;
         for(int i = 0;i < n;i++){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                map.put(stack.pop(),nums2[i]);
            }

            // arr[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(nums2[i]);
        }
        // return arr;
        for (int j = 0; j < nums1.length; j++) {
            arr[j] = map.getOrDefault(nums1[j], -1);
        }
        return arr;
    }
}