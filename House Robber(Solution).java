class Solution {
    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int n = nums.length;
        int[] dp = new int[n];

        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {2, 7, 9, 3, 1};
        System.out.println("Max Money (Example 1): " + solution.rob(nums1));
        System.out.println("Max Money (Example 2): " + solution.rob(nums2));
    }
}
