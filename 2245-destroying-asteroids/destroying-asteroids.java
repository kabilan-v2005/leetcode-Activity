class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);

        long curmass = mass;
        
        for(int i = 0;i < asteroids.length;i++){
            if(curmass >= asteroids[i]){
                curmass += asteroids[i];
            }
            else{
                return false;
            }
        }
        return true;
    }
}