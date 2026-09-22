class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            rotateOnce(nums);
        }
    }

    private void rotateOnce(int[] nums) {
        int last = nums[nums.length - 1];

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = last;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna