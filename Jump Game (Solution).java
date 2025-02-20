class Solution {
    public boolean canJump(int[] nums) {
        int farthest = 0; 
        
        for (int i = 0; i < nums.length; i++) {
            if (i > farthest) {
                return false; 
            }
            farthest = Math.max(farthest, i + nums[i]); 
            if (farthest >= nums.length - 1) {
                return true; 
            }
        }
        
        return true;
    }

    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        int[] nums1 = {2, 3, 1, 1, 4};
        System.out.println(solution.canJump(nums1)); 
        
        int[] nums2 = {3, 2, 1, 0, 4};
        System.out.println(solution.canJump(nums2)); 
        
        int[] nums3 = {1, 1, 1, 1, 1};
        System.out.println(solution.canJump(nums3)); 
        
        int[] nums4 = {2, 0, 0};
        System.out.println(solution.canJump(nums4)); 
        
        int[] nums5 = {0, 2, 3};
        System.out.println(solution.canJump(nums5)); 
    }
}
