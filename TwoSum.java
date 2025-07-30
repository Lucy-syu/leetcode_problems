class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ant = -1;
        int act = -1;

        for (int i = 0; i < nums.length; i++) {
            for (int j= 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    act = i;
                    ant = j;
                }
            }
        }
        return new int[]{ant, act};
    }
}
