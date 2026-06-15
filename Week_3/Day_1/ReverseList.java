class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode new_head = reverseList(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return new_head;
    }
}