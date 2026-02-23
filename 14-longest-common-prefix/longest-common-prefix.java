class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        StringBuilder s=new StringBuilder();
        for(int i=0;i<strs[0].length();i++){
            if(first.charAt(i)!=last.charAt(i)) break;
            else s.append(first.charAt(i));
        }
        return s.toString();
    }
}