class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        List<Character> allow=new ArrayList<>();
        for(char i:allowed.toCharArray()){
            allow.add(i);
        }
       
        int count=0;
        for(String word:words){
             boolean b=true;
            for(char a:word.toCharArray()){
                if(!allow.contains(a)){
                    b=false;
                    break;
                }
            }
            if(b){
                count++;
            }
        }
        return count;

    }
}