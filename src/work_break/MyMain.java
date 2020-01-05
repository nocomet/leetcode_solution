package work_break;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyMain {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "leetcode";
        List<String> strings = Arrays.asList("leet", "code");
        System.out.println(solution.wordBreak(s, strings));
    }
}

class Solution {
    Set<String> visited = new HashSet<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0) {
            return true;
        }

        if (visited.contains(s)) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            String sub = s.substring(0, i + 1);
            if (wordDict.contains(sub)) {
                visited.add(sub);
                if (wordBreak(s.substring(i + 1), wordDict)) {
                    return true;
                }
            }
        }

        return false;
    }
}
