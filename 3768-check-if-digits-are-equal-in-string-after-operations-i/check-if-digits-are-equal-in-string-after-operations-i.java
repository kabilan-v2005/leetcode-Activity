class Solution {
    public boolean hasSameDigits(String s) {
        String str = s;

        while (str.length() > 2) {
            String r = "";
            for (int i = 0; i < str.length() - 1; i++) {
                int a = str.charAt(i) - '0';       // convert char to int
                int b = str.charAt(i + 1) - '0';   // convert next char to int
                int sum = (a + b) % 10;            // take mod 10
                r += sum;                          // append to new string
            }
            str = r;                               // update string for next round
        }

        // After loop, check if both digits are same
        return str.charAt(0) == str.charAt(1);
    }
}
