import java.util.*;

class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // max-heap [web:3]
        for (int x : nums) pq.offer(x); // O(n log n) total inserts [web:3]
        int a = pq.poll(); // largest [web:3]
        int b = pq.poll(); // second largest [web:3]
        return (a - 1) * (b - 1); // (max1-1)*(max2-1) [web:3]
    }
}
