class Solution {
    public boolean checkIfPangram(String sentence) {
    //    String s="qwertyuiopasdfghjklzxcvbnm";
       Set<Character> set=new HashSet<>();
       for(Character i:sentence.toCharArray()){
            set.add(i);
       }
       if(set.size()==26) return true;
       return false;
    }
}