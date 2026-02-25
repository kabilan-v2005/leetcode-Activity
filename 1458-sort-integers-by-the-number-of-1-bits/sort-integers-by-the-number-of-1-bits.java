class Solution {

    public int[] sortByBits(int[] arr) {

        int n = arr.length;
        int[] bits = new int[n];

        // Step 1: count bits for each number
        for (int i = 0; i < n; i++) {
            bits[i] = countBits(arr[i]);
        }

        // Step 2: bubble sort (brute force)
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (bits[j] > bits[j + 1] ||
                   (bits[j] == bits[j + 1] && arr[j] > arr[j + 1])) {

                    // swap bits
                    int tempBit = bits[j];
                    bits[j] = bits[j + 1];
                    bits[j + 1] = tempBit;

                    // swap values
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    // Step 3: manual bit count
    private int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n % 2;
            n = n / 2;
        }
        return count;
    }
}