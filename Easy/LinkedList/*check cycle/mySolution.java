import java.util.HashMap;
import java.util.HashSet;

public class mySolution {

    /*
     * Runtime: 8 ms, faster than 10.56% of Java online submissions for Linked List
     * Cycle.
     * Memory Usage: 48.2 MB, less than 5.50% of Java online submissions for Linked
     * List Cycle.
     */
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode curr = head;

        while (curr != null) {
            if (set.contains(curr)) {
                return true;
            }
            set.add(curr);
            curr = curr.next;
        }
        return false;
    }
}
