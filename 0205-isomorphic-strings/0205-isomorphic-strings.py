class Solution(object):
    def isIsomorphic(self, s, t):
        s_to_t = {}
        t_to_s = {}

        for a, b in zip(s, t):
            if a in s_to_t and s_to_t[a] != b:
                return False

            if b in t_to_s and t_to_s[b] != a:
                return False

            s_to_t[a] = b
            t_to_s[b] = a

        return True
        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna