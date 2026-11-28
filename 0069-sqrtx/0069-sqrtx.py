class Solution:
    def mySqrt(self, x: int) -> int:
        i = 0
        while i*i <=x:
            i = i + 1
        
        return i-1

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna