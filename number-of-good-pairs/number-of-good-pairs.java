class Solution {
    public int numIdenticalPairs(int[] nums) {
               if(nums.length==0)
          return -1;
        Arrays.sort(nums);
        int count=0;
        // int add=0;
        for(int j=0;j<nums.length;j++){
        for(int i=j+1;i<nums.length;i++){
          if(nums[j]!=nums[i])
              break;
          else
              count++;
        }
        }
        return count;
    }
}