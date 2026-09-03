class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        String result = "";

        for(int i = words.length-1;i>=0;i--) {
            result += words[i];
            if(i!=0) {
                result += " ";
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna