class Solution {
    int[] tree;
    int n;

    void update(int pos, int val, int node, int start, int end) {
        if (start == end) {
            tree[node] = val; // overwrite, not Math.max
            return;
        }
        int mid = (start + end) / 2;
        if (pos <= mid) update(pos, val, 2*node, start, mid);
        else update(pos, val, 2*node+1, mid+1, end);
        tree[node] = Math.max(tree[2*node], tree[2*node+1]);
    }

    int query(int l, int r, int node, int start, int end) {
        if (r < start || end < l) return 0;
        if (l <= start && end <= r) return tree[node];
        int mid = (start + end) / 2;
        return Math.max(query(l, r, 2*node, start, mid),
                        query(l, r, 2*node+1, mid+1, end));
    }

    public List<Boolean> getResults(int[][] queries) {
        int maxX = 0;
        for (int[] q : queries) maxX = Math.max(maxX, q[1]);

        n = maxX + 1;
        tree = new int[4 * n];

        TreeSet<Integer> obstacles = new TreeSet<>();
        obstacles.add(0);
        update(0, 0, 1, 0, n - 1);

        List<Boolean> results = new ArrayList<>();

        for (int[] q : queries) {
            if (q[0] == 1) {
                int x = q[1];
                int prev = obstacles.floor(x);
                
                // Gap from prev->x stored at x
                update(x, x - prev, 1, 0, n - 1);

                // Gap from x->next (shrinks old prev->next gap)
                Integer next = obstacles.higher(x);
                if (next != null) {
                    update(next, next - x, 1, 0, n - 1); //  overwrites stale gap
                }

                obstacles.add(x);
            } else {
                int x = q[1], sz = q[2];
                int lastObstacle = obstacles.floor(x);
                int tailGap = x - lastObstacle;

                if (tailGap >= sz) {
                    results.add(true);
                } else {
                    int maxGap = query(0, lastObstacle, 1, 0, n - 1);
                    results.add(maxGap >= sz);
                }
            }
        }

        return results;
    }
}