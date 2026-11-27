class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        left = 0
        right = 1

        max_profit = 0

        while right < len(prices):

            if prices[right] > prices[left]:
                profit = prices[right] - prices[left]
                max_profit = max(max_profit, profit)

            else:
                left = right

            right += 1

        return max_profit

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna