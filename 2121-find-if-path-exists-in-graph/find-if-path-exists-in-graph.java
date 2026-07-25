class Solution {
    boolean dfs(int node,int dest,List<List<Integer>> graph,boolean visited[]){
        if(node==dest) return true;
        visited[node]=true;
        for(int n:graph.get(node)){
            if(!visited[n])
            if(dfs(n,dest,graph,visited)) return true;
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);  
        }

        boolean visited[] = new boolean[n];
        return dfs(source,destination,graph,visited);
        // Queue<Integer> q = new LinkedList<>();
        // vis[source] = true;
        // q.offer(source);
        // while(!q.isEmpty()){
        //     int curr = q.poll();
        //     if(curr == destination) return true;

        //     for(int i : graph.get(curr)){
        //         if(!vis[i]){    
        //             vis[i] = true;
        //             q.offer(i);
        //         }
        //     }
        // }
        // return false;

    }
}