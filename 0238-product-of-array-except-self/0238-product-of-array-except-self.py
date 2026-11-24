class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:

        ans = []

        for i in range(len(nums)):
            product = 1

            for j in range(len(nums)):
                if i != j:
                    product *= nums[j]

            ans.append(product)

        return ans

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna