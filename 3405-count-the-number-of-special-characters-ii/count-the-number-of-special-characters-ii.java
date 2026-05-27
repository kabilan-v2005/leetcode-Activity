class Solution {
    public int numberOfSpecialChars(String word) {

        boolean[] lower = new boolean[26];
        boolean[] upper = new boolean[26];
        boolean[] invalid = new boolean[26];

        for(int i=0;i<word.length();i++){

            char ch = word.charAt(i);

            if(Character.isLowerCase(ch)){

                int idx = ch - 'a';

                if(upper[idx]){
                    invalid[idx] = true;
                }

                lower[idx] = true;
            }
            else{

                int idx = ch - 'A';
                upper[idx] = true;
            }
        }

        int count = 0;

        for(int i=0;i<26;i++){

            if(lower[i] && upper[i] && !invalid[i]){
                count++;
            }
        }

        return count;
    }
}