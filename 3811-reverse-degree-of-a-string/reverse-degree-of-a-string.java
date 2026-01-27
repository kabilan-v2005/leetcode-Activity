class Solution {
    public int reverseDegree(String s) {
        // char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','u','v','w','x','y','z'};
        int sum=0;
        for(int i=0;i<s.length();i++){
            int val =  s.charAt(i);
            int reverse=123 -val;
            
            sum+=reverse * (i+1);

        }
        return sum;
        
    }
}