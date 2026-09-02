class Solution {
    public boolean uniformArray(int[] nums1) {
        // int[] nums2 = new int[nums1.length];

        // for(int i = 0;i < nums1.length - 1;i++){
        //     if(nums1[i] % 2 == 0){
        //         nums2[i] = Math.abs(nums1[i] - nums1[i + 1]);
        //     }

        //     else{
        //         nums2[i] = nums1[i];
        //     }
        // }
        // nums2[nums2.length - 1] = nums1[nums1.length - 1];
        // boolean expectsEven = (nums2[0] % 2 == 0); 

        // for (int i = 0; i < nums2.length; i++) {
        //     boolean isCurrentEven = (nums2[i] % 2 == 0);
           
        //     if (isCurrentEven != expectsEven) {
        //         return false;
        //     }
        // }
        return true;
    }
}