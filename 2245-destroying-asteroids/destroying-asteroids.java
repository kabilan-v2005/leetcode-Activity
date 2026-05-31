class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long curMass = mass;

        for (int asteroid : asteroids) {
            if (curMass >= asteroid) {
                curMass += asteroid;
            } else {
                return false;
            }
        }

        return true;
    }
}