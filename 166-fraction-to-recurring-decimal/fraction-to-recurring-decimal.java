class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";  // case: 0

        StringBuilder sb = new StringBuilder();

        // handle sign
        if ((numerator < 0) ^ (denominator < 0)) {
            sb.append("-");
        }

        // convert to long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);

        // integer part
        sb.append(num / den);
        long remainder = num % den;

        if (remainder == 0) {
            return sb.toString(); // no decimal part
        }

        sb.append(".");

        // map to store remainder positions
        Map<Long, Integer> map = new HashMap<>();
        
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                // repeating starts here
                sb.insert(map.get(remainder), "(");
                sb.append(")");
                break;
            }

            map.put(remainder, sb.length());
            remainder *= 10;
            sb.append(remainder / den);
            remainder %= den;
        }

        return sb.toString();
    }
}
