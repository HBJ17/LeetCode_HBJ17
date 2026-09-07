class Solution(object):
    def isPalindrome(self, s):
        s = s.lower()
        result = ""

        for i in s:
            if i.isalnum():
                result = result + i
        return result==result[::-1]

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna