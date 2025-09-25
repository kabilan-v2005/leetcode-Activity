import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // Start from the second last row and go upwards
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            List<Integer> rowBelow = triangle.get(i + 1);

            for (int j = 0; j < row.size(); j++) {
                // Update each element: add min of two adjacent numbers in row below
                row.set(j, row.get(j) + Math.min(rowBelow.get(j), rowBelow.get(j + 1)));
            }
        }

        // Top element now contains the minimum path sum
        return triangle.get(0).get(0);
    }

    // Test the code
    public static void main(String[] args) {
        Solution sol = new Solution();

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>(Arrays.asList(-1)));
        triangle.add(new ArrayList<>(Arrays.asList(2, 3)));
        triangle.add(new ArrayList<>(Arrays.asList(1, -1, -3)));

        System.out.println(sol.minimumTotal(triangle)); // Output: -1
    }
}
