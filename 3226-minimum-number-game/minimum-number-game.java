import java.util.*;

class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int n : nums) pq.add(n);

        int[] arr = new int[nums.length];
        int i = 0;

        while (!pq.isEmpty()) {
            int a = pq.poll();
            int b = pq.poll(); 
            arr[i++] = b;
            arr[i++] = a;
        }

        return arr;
    }
}
