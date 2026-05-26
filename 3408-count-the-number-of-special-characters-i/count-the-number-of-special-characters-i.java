class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        int count = 0;
        for(int i = 0;i < word.length();i++){
            if(Character.isLowerCase(word.charAt(i))){
                set1.add(Character.toUpperCase(word.charAt(i)));
            }
            else{
                set2.add(word.charAt(i));
            }
        }

        for(Character c : set2){
            if(set1.contains(c)) count++;
        }

        return count;
    }
}