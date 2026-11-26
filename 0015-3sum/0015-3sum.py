class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        ans = set()
        n = len(nums)

        for i in range(n):
            seen = set()

            for j in range(i + 1, n):
                complement = -nums[i] - nums[j]

                if complement in seen:
                    triplet = tuple(sorted([nums[i], nums[j], complement]))
                    ans.add(triplet)

                seen.add(nums[j])

        return [list(t) for t in ans]

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna