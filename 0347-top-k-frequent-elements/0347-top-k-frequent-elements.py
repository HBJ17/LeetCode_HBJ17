class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:

        d = {}

        for i in nums:
            d[i] = d.get(i, 0) + 1

        sorted_d = dict(sorted(d.items(), key=lambda x: x[1], reverse=True))

        result = []

        for key in sorted_d:
            result.append(key)

        return result[:k]

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna