class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0,a = 0,l =0,o = 0,n = 0;
        for(int i = 0;i < text.length();i++){
            if(text.charAt(i) == 'b') b++;
            if(text.charAt(i) == 'a') a++;
            if(text.charAt(i) == 'l') l++;
            if(text.charAt(i) == 'o') o++;
            if(text.charAt(i) == 'n') n++;
        }
        
        return Math.min(
                Math.min(b, a),
                Math.min(
                    Math.min(l / 2, o / 2),n));
    }
}