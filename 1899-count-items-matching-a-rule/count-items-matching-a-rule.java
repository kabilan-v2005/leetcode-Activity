class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        for(int i=0;i<items.size();i++){
            for(int j=0;j<items.get(i).size();j++){
                if(j==0 && ruleKey.equals("type")){
                    if( items.get(i).get(j).equals(ruleValue)) {
                      count++;
                    }
                }
                if(j==1 && ruleKey.equals("color")){
                    if( items.get(i).get(j).equals(ruleValue)) {
                        count++;                                    
                }
            }
            if(j==2 && ruleKey.equals("name")){
                if( items.get(i).get(j).equals(ruleValue)) {
                    count++;
                }
            }
                                                                                                 
            }
                
            }
        
        return count;
    }
}