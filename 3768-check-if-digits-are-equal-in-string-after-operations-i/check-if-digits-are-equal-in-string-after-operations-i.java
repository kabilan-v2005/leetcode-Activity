class Solution {
    public boolean hasSameDigits(String s) {
        String str=s;
        
       
        while(str.length()>2){
            String r="";
            for(int i=0;i<str.length()-1;i++){
                r+=(str.charAt(i)+str.charAt(i+1))%10;
            }
            str=r;
        }
        if(str.charAt(0)==str.charAt(1)){
            return true;
        }
        return false;
    }
}