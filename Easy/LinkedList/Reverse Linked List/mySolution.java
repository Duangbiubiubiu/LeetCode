public class mySolution {
    /*
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse
     * Linked List.
     * Memory Usage: 42.2 MB, less than 85.74% of Java online submissions for
     * Reverse Linked List.
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

    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;

        ListNode reverse = new ListNode(head.val, null);
        ListNode curr = head.next;

        while (curr != null) {
            ListNode newNode = curr;
            curr = curr.next;
            newNode.next = reverse;
            reverse = newNode;
        }
        return head = reverse;

    }
}
