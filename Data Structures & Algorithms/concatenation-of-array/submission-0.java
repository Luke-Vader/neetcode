class Solution {
    public int[] getConcatenation(int[] nums) {
        if(nums.length <= 1000){
            int l = 2*nums.length;
            int[] ans = new int[l];
            for(int i = 0; i < nums.length; i++){
                ans[i] = nums[i];
                ans[i+nums.length] = nums[i];
            }
            return ans;
        }else return null;
    }
}