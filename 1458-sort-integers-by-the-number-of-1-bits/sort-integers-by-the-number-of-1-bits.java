class Solution {
    public int[] sortByBits(int[] arr) {

        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Arrays.sort(temp, (a, b) -> {
            int bitA = Integer.bitCount(a);
            int bitB = Integer.bitCount(b);

            if (bitA != bitB) {
                return bitA - bitB;     
            }
            return a - b;               
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }

        return arr;
    }
}