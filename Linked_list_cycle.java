public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode, Integer> hashTable = new HashMap<ListNode, Integer>();
        while(head != null) {
            if(hashTable.get(head) != null && hashTable.get(head) == 1) return true;
            hashTable.put(head,1);
            head = head.next;
        }
        return false;       
    }
}