class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       ArrayList<Integer> al = new ArrayList<>();
    for(int i=0 ;i<nums.length;i++){
        al.add(index[i],nums[i]);
    }
    int[] arr = new int[al.size()];
    for(int i=0 ;i<nums.length;i++)
        arr[i]=al.get(i);
            
    return arr; 
    }
}