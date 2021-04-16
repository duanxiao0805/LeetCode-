### 输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。

例如，一个链表有 6 个节点，从头节点开始，它们的值依次是 1、2、3、4、5、6。这个链表的倒数第 3 个节点是值为 4 的节点。

 

示例：

```
给定一个链表: 1->2->3->4->5, 和 k = 2.

返回链表 4->5.
```
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
