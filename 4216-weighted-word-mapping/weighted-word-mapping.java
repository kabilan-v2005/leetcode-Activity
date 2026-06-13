class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        // String s = "";
        StringBuilder str = new StringBuilder();

        for(int i = 0;i < words.length;i++){
            int sum = 0;
            for(int j = 0;j < words[i].length();j++){
                int val = words[i].charAt(j) - 'a';
                
                sum += weights[val];
            }
            int modval = sum % 26;
            char c = (char) ('z' - modval);
            str.append(c);
        }
        return str.toString();
    }
}