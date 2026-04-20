class Solution {
    public int maxDistance(int[] colors) {
        int max=0;
        int dis=0;
        int val=colors[0];
        int val2=colors[1];
        for(int i=0;i<colors.length;i++){
            for(int j=0;j<colors.length;j++){
                if(colors[i]==colors[j]){
                    continue;
                }
                dis=Math.abs(i-j);
                max=Math.max(dis,max);
            }

        }
        return max;
    }
}