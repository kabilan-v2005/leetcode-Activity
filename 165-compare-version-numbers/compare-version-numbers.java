class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ve1 = version1.split("\\.");
        String[] ve2 = version2.split("\\.");

        int[] v1 = new int[ve1.length];
        for (int i = 0; i < ve1.length; i++) {
            v1[i] = Integer.parseInt(ve1[i]);
        }

        int[] v2 = new int[ve2.length];
        for (int i = 0; i < ve2.length; i++) {
            v2[i] = Integer.parseInt(ve2[i]);
        }

        int length = Math.max(v1.length, v2.length);

        for (int i = 0; i < length; i++) {
            int num1 = i < v1.length ? v1[i] : 0; // if shorter, treat as 0
            int num2 = i < v2.length ? v2[i] : 0;

            if (num1 < num2) {
                return -1;
            }
            if (num1 > num2) {
                return 1;
            }
        }

        return 0; // only if all parts equal
    }
}
