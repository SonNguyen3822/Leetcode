class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if(head == null) return head;
        ListNode illiterate = head.next;

        while(true) {
            while(illiterate != null && illiterate.val == head.val) illiterate = illiterate.next;
            head.next = illiterate;
            head = head.next;
            if(head == null) break;
            illiterate = head.next;
        }
        return current;
    }
}