package work_break;

import java.util.Arrays;
import java.util.List;

public class SolutionMain {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        String s = "leetcode";
        List<String> strings = Arrays.asList("leet", "code");
        System.out.println(solution.wordBreak(s, strings));
    }
}

class Solution2 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] b = new boolean[s.length() + 1];
        b[0] = true;

        for (int i = 1; i < s.length() + 1; i++) {
            for (int j = 0; j < i ; j++) {
                String sub = s.substring(j, i);
                if (b[j] && wordDict.contains(sub)) {
                    b[i] = true;
                }
            }
        }
        return b[s.length()];
    }
}
