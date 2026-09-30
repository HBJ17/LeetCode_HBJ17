class Solution(object):
    def removeDuplicates(self, nums):
        k = 1
        for i in range(1,len(nums)):
            if(nums[i] != nums[i-1]):
                nums[k] = nums[i]
                k = k +1
        return k

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna