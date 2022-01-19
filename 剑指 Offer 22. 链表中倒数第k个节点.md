##### 解法一:求长度,遍历
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode cur=head;
        //遍历链表,那就先求链表的长度
        //怎么求长度? 这样遍历的时候指向的地方不是空,那么计数就+1
        int len=0;
        while(cur!=null){
            cur=cur.next;
            len++;
        }
        for(int i=0;i<len-k;i++){
            head=head.next;
        }
        return head;
    }
}
```
##### 解法二:快慢指针
```Java
 //Definition for singly-linked list.
 public class ListNode {
     int val;
     ListNode next;
     ListNode(int x) { val = x;}
}
 
class Solution {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode f=head,l=head;
        //快慢指针f和l
        //刚开始都指向head,先让f遍历
        for(int i=0;i<k;i++)
            f=f.next;
        while(f!=null){
            f=f.next;
            l=l.next;
        }
        return l;
    }
}
```
