class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
    }
    return nums;
    }
}
Given an array of integers nums and an integer target, the task is to find two indices in the array such that the numbers at those indices add up to the given target. Each input is guaranteed to have exactly one solution, and you cannot use the same element twice.

