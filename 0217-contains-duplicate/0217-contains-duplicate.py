class Solution(object):
    def containsDuplicate(self, nums):
        s = set()
        for i in nums:
            if(i in s):
                return True
            else:
                s.add(i)
        return False

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna