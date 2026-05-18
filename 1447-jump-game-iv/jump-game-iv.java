class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        Map<Integer,List<Integer>> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.computeIfAbsent(arr[i],k->new ArrayList<>()).add(i);
        }
        int[] vis=new int[n];
        Arrays.fill(vis,-1);
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=0;
        while(!q.isEmpty()){
            int cur=q.poll();
            if(cur==n-1) return vis[cur];
            if(cur-1>=0 && vis[cur-1]==-1){
                q.add(cur-1);
                vis[cur-1]=vis[cur]+1;
            }
            if(cur+1<n && vis[cur+1]==-1){
                q.add(cur+1);
                vis[cur+1]=vis[cur]+1;
            }
            if(map.containsKey(arr[cur])){
                for(int idx:map.get(arr[cur])){
                    if(vis[idx]==-1){
                        q.add(idx);
                        vis[idx]=vis[cur]+1;
                    }
                }
                map.remove(arr[cur]);
            }
        }
        return -1;
    }
}