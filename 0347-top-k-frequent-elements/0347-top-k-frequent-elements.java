class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        boolean[] visited = new boolean[n];

        int[] elements = new int[n];
        int[] frequencies = new int[n];
        int unique = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            elements[unique] = nums[i];
            frequencies[unique] = count;
            unique++;
        }

        for (int i = 0; i < unique - 1; i++) {
            for (int j = i + 1; j < unique; j++) {
                if (frequencies[j] > frequencies[i]) {
                    int temp = frequencies[i];
                    frequencies[i] = frequencies[j];
                    frequencies[j] = temp;

                    temp = elements[i];
                    elements[i] = elements[j];
                    elements[j] = temp;
                }
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = elements[i];
        }

        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna