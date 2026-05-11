class Solution {
    public int[] separateDigits(int[] nums) {

        StringBuilder str = new StringBuilder();

        for (int num : nums) {
            str.append(num);
        }

        int[] res = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            res[i] = str.charAt(i) - '0';
        }

        return res;
    }
}