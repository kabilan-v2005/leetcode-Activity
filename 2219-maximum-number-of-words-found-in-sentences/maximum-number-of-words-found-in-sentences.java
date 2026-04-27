class Solution {
    public int mostWordsFound(String[] sentences) {
        int n=sentences.length;
        int max=0;
        for(int i=0;i<n;i++){
            int curlen=sentences[i].split(" ").length;
            max=Math.max(max,curlen);
        }
        return max;
    }
}