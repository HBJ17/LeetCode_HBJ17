class Solution:
    def topKFrequent(self, nums: list[int], k: int) -> list[int]:
        l = {}
        c = []

        for i in nums:
            count = 0
            for j in nums:
                if(i == j):
                    count += 1
            l[i] = count

        sorted_d = dict(sorted(l.items(), key=lambda x: x[1], reverse=True))

        for i in sorted_d:
            c.append(i)

        return c[:k]

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna