import java.util.Stack;

// ##  again solve this

public class removeadjacentstring2 {

    static class Pair {
        char ch;
        int count;

        Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static void main(String[] args) {

        String s = "deeedbbcccbdaa";
        int k = 3;
        System.out.println(removeDuplicates(s, k));
    }

    static String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(new Pair(ch, 1));
                continue;
            }

            if (stack.peek().ch != ch) {
                stack.push(new Pair(ch, 1));
                continue;
            }

            if (stack.peek().count < k - 1) {
                Pair p = stack.peek();
                stack.pop();
                stack.push(new Pair(p.ch, p.count + 1));
                continue;
            }

            stack.pop();
        }

        while (!stack.isEmpty()) {
            Pair p = stack.peek();
            stack.pop();

            while (p.count-- > 0) {
                res.append(p.ch);
            }
        }

        return res.reverse().toString();
    }
}