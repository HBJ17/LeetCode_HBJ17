class Solution(object):
    def isAnagram(self, s, t):
        return len(s) == len(t) and sorted(s) == sorted(t)
        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna