import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Arrays;

public class wordladder {

    public static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";

        String[] wordList = {
            "hot", "dot", "dog", "lot", "log", "cog"
        };

        System.out.println(
            ladderLength(
                beginWord,
                endWord,
                Arrays.asList(wordList)
            )
        );
    }

    static int ladderLength(
            String beginWord,
            String endWord,
            List<String> wordList) {

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        queue.add(null);

        Set<String> visited = new HashSet<>();
        visited.add(beginWord);

        int level = 1;

        while (!queue.isEmpty()) {

            String word = queue.poll();

            if (word == null) {
                level++;

                if (!queue.isEmpty()) {
                    queue.add(null);
                }

                continue;
            }

            if (word.equals(endWord)) {
                return level;
            }

            for (int i = 0; i < word.length(); i++) {

                char[] chars = word.toCharArray();

                for (char c = 'a'; c <= 'z'; c++) {

                    chars[i] = c;

                    String nextWord = new String(chars);

                    if (wordList.contains(nextWord)
                            && !visited.contains(nextWord)) {

                        visited.add(nextWord);
                        queue.offer(nextWord);
                    }
                }
            }
        }

        return 0;
    }
}
