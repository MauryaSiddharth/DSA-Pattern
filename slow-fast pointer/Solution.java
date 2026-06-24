//     direct solution leetcode
// Linkedlist cycle
public class Solution {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // move 1 step
            fast = fast.next.next;     // move 2 steps

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
// https://www.youtube.com/watch?v=vlrxs-LPni4
