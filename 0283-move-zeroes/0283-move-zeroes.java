class Solution {
    public void moveZeroes(int[] nums) {
        int[] result = new int[nums.length];
        int j = 0;

        for(int i = 0;i<nums.length;i++) {
            if(nums[i] != 0) {
                result[j] = nums[i];
                j = j + 1;
            }
        }
        for(int i = 0;i<nums.length;i++) {
            if(nums[i] == 0) {
                result[j] = 0;
                j = j + 1;
            }
        }    
        for(int i = 0;i<nums.length;i++) {
            nums[i] = result[i];
        } 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna