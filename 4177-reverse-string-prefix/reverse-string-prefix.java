class Solution {
    public String reversePrefix(String s, int k) {
        int l=0,r=k-1;
        StringBuilder sb=new  StringBuilder(s);
        while(l<r){
            char temp = sb.charAt(l);
            sb.setCharAt(l, sb.charAt(r));
            sb.setCharAt(r, temp);
            l++;
            r--;
        }

    return sb.toString();
    }
}