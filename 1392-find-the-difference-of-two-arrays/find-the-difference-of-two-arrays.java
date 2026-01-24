class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> innerlist1=new HashSet<>();
        Set<Integer> innerlist2=new HashSet<>();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();


        
        for(int i:nums1)
            innerlist1.add(i);
        for(int i:nums2)
            innerlist2.add(i);

        for(int i:innerlist1){
            if(!innerlist2.contains(i)){
                list1.add(i);
            }
        }
        for(int i:innerlist2){
            if(!innerlist1.contains(i)){
                list2.add(i);
            }
        }                                    
            
            
        
        List<List<Integer>> mainlist=new ArrayList<>();
        mainlist.add(list1);
        mainlist.add(list2);

        return mainlist;

    }
}