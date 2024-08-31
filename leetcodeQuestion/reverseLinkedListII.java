// Link - https://leetcode.com/problems/reverse-linked-list-ii/
class Solution {
   public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;

        // move the pointers to the left - 1 times
        // Check for null expection for current pointer

        for (int i = 0; cur != null && i < left -1; i++) {
            prev = cur;
            cur = cur.next;
        }
        ListNode Last = prev;
        ListNode newLast = cur;
        ListNode next = cur.next;

        // now reverse the nodes between the Left and Right
        for (int i = 0; cur != null && i < right - left + 1; i++) {
            cur.next = prev;
            prev = cur;
            cur = next;
            if(next != null){
                next = next.next;
            }
        }
      if(Last != null){
          Last.next = prev;
      }
      else {
          head = prev;
      }
        newLast.next = cur;
      
      return head;
    }
}
