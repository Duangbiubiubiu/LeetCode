public class solution {
    /*
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List
     * Cycle.
     * Memory Usage: 45.9 MB, less than 51.88% of Java online submissions for Linked
     * List Cycle.
     * 
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
        ListNode f = head; // fast
        ListNode s = head; // slow

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                return true;
            }
        }
        return false;
    }

    /*
     * let's say 2 people are running in a circular track, one person is
     * running slowly and another person is running faster(2 times the speed of
     * first person)
     * 
     * After a certain period of time person 2 again meet or overtake person 1,
     * 
     * In that case we can conclude that the track is circular ( replace running
     * track with our Linked list)
     */
}
