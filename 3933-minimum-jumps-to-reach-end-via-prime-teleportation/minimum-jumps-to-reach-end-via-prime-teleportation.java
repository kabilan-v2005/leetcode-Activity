class Solution {
    public int minJumps(int[] nums) {

        int n = nums.length;

        // divisor -> list of indices divisible by divisor
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {

            int val = nums[i];

            for (int d = 1; d * d <= val; d++) {

                if (val % d == 0) {

                    map.putIfAbsent(d, new ArrayList<>());
                    map.get(d).add(i);

                    if (d != val / d) {

                        map.putIfAbsent(val / d, new ArrayList<>());
                        map.get(val / d).add(i);
                    }
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();

        boolean[] visited = new boolean[n];

        // to avoid processing same prime again
        HashSet<Integer> usedPrime = new HashSet<>();

        q.offer(0);

        visited[0] = true;

        int jumps = 0;

        while (!q.isEmpty()) {

            int size = q.size();

            for (int s = 0; s < size; s++) {

                int i = q.poll();

                // reached last index
                if (i == n - 1) {
                    return jumps;
                }

                // move left
                if (i - 1 >= 0 && !visited[i - 1]) {

                    visited[i - 1] = true;

                    q.offer(i - 1);
                }

                // move right
                if (i + 1 < n && !visited[i + 1]) {

                    visited[i + 1] = true;

                    q.offer(i + 1);
                }

                // teleportation
                int val = nums[i];

                if (isPrime(val) && !usedPrime.contains(val)) {

                    usedPrime.add(val);

                    ArrayList<Integer> list = map.get(val);

                    if (list != null) {

                        for (int idx : list) {

                            if (!visited[idx]) {

                                visited[idx] = true;

                                q.offer(idx);
                            }
                        }
                    }
                }
            }

            jumps++;
        }

        return -1;
    }

    private boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}