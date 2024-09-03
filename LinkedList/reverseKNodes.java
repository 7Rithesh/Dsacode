class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1 || head == null){
            return head;
        }

         ListNode prev = null;
         ListNode cur = head;
         ListNode next = cur.next;

         int length = getLength(head);
         int count = length / k;

         while(count > 0){
            ListNode last = prev;
            ListNode newEnd = cur;

            for(int i =0 ; cur != null && i < k ; i++){
                cur.next = prev;
                prev = cur;
                cur = next;
                if(next != null){
                    next = next.next;
                }
            }

            if(last != null){
                last.next = prev;
            }
            else{
                head = prev;
            }

            newEnd.next = cur;
            prev = newEnd;

            count --;
         } 

         return head;
    }

    public int getLength(ListNode head){
         ListNode temp = head;
         int length = 0;
         while(temp != null){
            length ++;
            temp = temp.next;
         }
         return length;
    }
}
