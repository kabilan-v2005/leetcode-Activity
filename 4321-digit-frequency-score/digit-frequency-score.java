class Solution {
    public int digitFrequencyScore(int n) {
    //   Map<Integer,Integer> map = new HashMap<>();
    int sum = 0;
      while(n > 0){
        int d = n % 10;
        // map.put(d,map.getOrDefault(d,0) + 1);
        sum += d;
        n/=10;
      } 
    //   int sum = 0;
    //   for(Map.Entry<Integer,Integer> entry : map.entrySet()){
    //     sum += entry.getKey() * entry.getValue();
    //   }
      return sum;
    }
}