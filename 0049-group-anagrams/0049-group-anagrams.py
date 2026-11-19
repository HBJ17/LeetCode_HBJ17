class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        ans = []
        used = set()                         

        for i in range(len(strs)):
            if i in used:                     
                continue

            l = [strs[i]]
            for j in range(i + 1, len(strs)):
                if len(strs[i]) == len(strs[j]) and sorted(strs[i]) == sorted(strs[j]):
                    l.append(strs[j])
                    used.add(j)

            ans.append(l)                     

        return ans

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna