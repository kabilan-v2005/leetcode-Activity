class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        List<String> arr=new ArrayList<>();

        for(int i=0;i<queries.length;i++){
            for(int j=0;j<dictionary.length;j++){
                int check=0;
                for(int k=0;k<queries[0].length();k++){
                    if(queries[i].charAt(k)!=dictionary[j].charAt(k)){
                        check++;
                    }
                }
                if(check<=2){
                    arr.add(queries[i]);
                    break;
                }
            }
            
        }
        return arr;
    }
}