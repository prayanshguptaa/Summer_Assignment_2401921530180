class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        ListNode temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        if(count == n) {
            return head.next;
        }
        n = count-n+1;
        ListNode prev = head;
        for(int i=0; i<n-2; i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}