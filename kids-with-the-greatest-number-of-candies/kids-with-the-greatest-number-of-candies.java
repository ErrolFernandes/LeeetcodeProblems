class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        Boolean [] list = new Boolean[candies.length];
        for (int i : candies) if (i>max) max = i;
        for (int i=0; i<candies.length; i++) list[i] = (candies[i]+extraCandies >= max);
        return Arrays.asList(list); 
    }
}