class Solution {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int n = nums.length;   
        int i = 0;

        while (i < n) {
            if (seen.contains(nums[i])) {
                for (int j = i; j < n - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                n--;          
            } else {
                seen.add(nums[i]);
                i++;
            }
        }
        return n;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna