class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        l = (s.strip()).split()
        return len(l[-1])

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna