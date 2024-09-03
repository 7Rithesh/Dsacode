class Solution {
    public ListNode rotateRight(ListNode head, int k) {
     if(k <= 0 || head == null){
        return head;
     }   
    ListNode temp = head;
    int length = 1;
    while(temp.next != null){
        temp = temp.next;
        length++;
    }
    temp.next = head;
    int rotates = k % length;
    int skipNodes = length - rotates;
    ListNode newLast = head;
    for(int i = 0 ; i < skipNodes -1 ; i++){
        newLast = newLast.next;
    }

    head = newLast.next;
    newLast.next = null;

    return head;
}
}
