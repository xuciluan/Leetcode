package list;

/**
 * 19. 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 */
public class deleteLastNNode_19 {

        public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head == null) return null;

            //遍历一遍，获取长度
            int count = 0;
            ListNode cur = head;
            while(cur != null){
                count ++;
                cur = cur.next;
            }

            ListNode dummyHead = new ListNode(-1,null);
            dummyHead.next = head;
            ListNode prev = dummyHead;
            int move = count - n;
            while(move > 0){
                prev = prev.next;
                move --;
            }

            //prev的下一个就是要删除的
            ListNode next = null;
            if(prev.next != null){
                next = prev.next.next;
            }
            prev.next = next;
            return dummyHead.next;
        }

}
