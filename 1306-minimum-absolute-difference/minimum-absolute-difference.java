class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        
        Arrays.sort(arr);

        int diff=arr[1]-arr[0];
        
        for(int i=0;i<arr.length -1;i++){
            int curdiff=arr[i+1] - arr[i];
            if(curdiff < diff){
                diff=curdiff;
                list.clear();
            }
            if(arr[i+1] - arr[i] == diff ){
                List<Integer> list1=new ArrayList<>();
                list1.add(arr[i]);
                list1.add(arr[i+1]);
                list.add(list1);
            }
        
        }
        return list;
        
    }
}