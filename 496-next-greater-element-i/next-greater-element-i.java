class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        Stack<Integer> stack = new Stack<>();
        // stack.push(nums2[n - 1]);
        int arr[] = new int[n];
        // arr[n - 1] = -1;
         for(int i = n - 1;i >= 0;i--){
            while(!stack.isEmpty() && nums2[i] > stack.peek()){
                stack.pop();
            }

            arr[i] = stack.isEmpty() ? -1 : stack.peek();

            stack.push(nums2[i]);
        }
        // return arr;
        int res[] = new int[nums1.length];
        for(int i = 0;i < nums1.length;i++){
            for(int j = 0; j < n;j++){
                if(nums1[i] == nums2[j]) res[i] = arr[j]; 
            }
        }
        return res;

    }
}