class Solution {
    public int[] separateDigits(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {

            List<Integer> temp = new ArrayList<>();

            while (num > 0) {
                temp.add(num % 10);
                num /= 10;
            }

            for (int i = temp.size() - 1; i >= 0; i--) {
                list.add(temp.get(i));
            }
        }

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}