class Solution {
    long factVal(int n){
        if(n == 0 || n == 1) return 1;

        return (n * factVal(n - 1)) % MOD;
    }
    static final long MOD = 1_000_000_007L;
    public int countAnagrams(String s) {
        String words[] = s.split(" ");
        long ans = 1;

        for(String word : words){
            int n = word.length();
            Map<Character,Integer> map = new HashMap<>();
            long fact = factVal(n);
            for(int i = 0;i < n;i++){
                map.put(word.charAt(i), map.getOrDefault(word.charAt(i),0) + 1);
            }
            // long  den = 1;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if(entry.getValue() > 1){
                    fact = fact *  modInverse(factVal(entry.getValue())) % MOD;
                }
            }
            ans = ans * fact % MOD;

        }   

        return (int) ans;

    }
    long modInverse(long n) {
        return power(n, MOD - 2);
    }

    long power(long a, long b) {

        long result = 1;

        while (b > 0) {

            if ((b & 1) == 1) {
                result = result * a % MOD;
            }

            a = a * a % MOD;
            b >>= 1;
        }

        return result;
    }
}