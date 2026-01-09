class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        
        StringBuilder result=new StringBuilder();
        for(int i=0;i<arr.length;i++){
           StringBuilder sb=new StringBuilder(arr[i]);
           sb.reverse();
           result.append(sb);

           if(i<arr.length -1){
            result.append(" ");
           }
        }
        
        return result.toString();
    }
}