class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : words){
            map.put(s,map.getOrDefault(s,0) + 1);
        }
        List<String> list = new ArrayList<>();
        Map<String, Integer> sortedMapDesc = map.entrySet()
                .stream()
                .sorted((a,b)->{
                    if(!a.getValue().equals(b.getValue())){
                        return b.getValue()-a.getValue();
                    }
                    return a.getKey().compareTo(b.getKey());
                })
                .collect(Collectors.toMap(
                        Map.Entry::getKey, 
                        Map.Entry::getValue, 
                        (oldValue, newValue) -> oldValue, 
                        LinkedHashMap::new
                ));
        int c = 0;
        for(Map.Entry<String,Integer> entry : sortedMapDesc.entrySet()){
            if(c == k){
                break;
            }
            list.add(entry.getKey());
            c++;
        }
        // Collections.sort(list);
        return list;

    }
}