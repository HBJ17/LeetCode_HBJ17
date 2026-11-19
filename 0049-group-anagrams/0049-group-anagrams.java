import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();


        for (int i = 0; i < strs.length; i++) {

            String s = strs[i];                


            char[] chars = s.toCharArray();     
            Arrays.sort(chars);                
            String key = new String(chars);     


            if (map.containsKey(key) == false) {

                List<String> newList = new ArrayList<>();

                map.put(key, newList);
            }

            List<String> group = map.get(key);

            group.add(s);
        }


        List<List<String>> result = new ArrayList<>();
        for (List<String> group : map.values()) {
            result.add(group);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna