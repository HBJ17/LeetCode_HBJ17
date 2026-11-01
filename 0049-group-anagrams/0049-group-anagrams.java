
import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue;

            List<String> a = new ArrayList<>();
            a.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j]) {
                    char[] c1 = strs[i].toCharArray();
                    char[] c2 = strs[j].toCharArray();

                    Arrays.sort(c1);
                    Arrays.sort(c2);

                    if (Arrays.equals(c1, c2)) {
                        a.add(strs[j]);
                        visited[j] = true;
                    }
                }
            }

            ans.add(a);
        }

        return ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna