import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);  // interpret as binary
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);         // add them
        return sum.toString(2);                  // convert back to binary string
    }
}
