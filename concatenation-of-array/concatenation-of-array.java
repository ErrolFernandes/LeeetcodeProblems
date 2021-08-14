class Solution {
    public int[] getConcatenation(int[] nums) {
       return IntStream.concat(Arrays.stream(nums), Arrays.stream(nums)).toArray();
    }
}