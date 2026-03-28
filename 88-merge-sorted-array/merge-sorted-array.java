class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList <Integer> arr=new ArrayList<>();
        
        for(int i=0;i<m;i++){
            arr.add(nums1[i]);
        }
        for(int j=0;j<n;j++){
            arr.add(nums2[j]);
        }
        // int a[]=new int[arr.size()];
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            nums1[i]=arr.get(i);
        }
        
        
    }
}