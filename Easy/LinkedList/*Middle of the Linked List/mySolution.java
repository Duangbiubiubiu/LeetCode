public class mySolution {
    /*
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of
     * the Linked List.
     * Memory Usage: 41 MB, less than 80.25% of Java online submissions for Middle
     * of the Linked List.
     * 
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        head = slow;
        return head;
    }

    /*
     * similar as check cycle one.
     */
}
