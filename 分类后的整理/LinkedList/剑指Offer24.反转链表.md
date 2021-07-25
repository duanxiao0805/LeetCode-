### 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

 
 

输入: 

```in
1->2->3->4->5->NULL
```

输出:

```out
 5->4->3->2->1->NULL
```


```Java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur=head;  //指向第一个
        ListNode pre=null;  //指向最后一个null
        while(cur!=null){
            ListNode temp=cur.next; //暂存节点
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }
}
```
## 图解
![image](https://user-images.githubusercontent.com/62934005/115345411-59b9e280-a1e1-11eb-8586-95c8f69ff6c6.png)
![image](https://user-images.githubusercontent.com/62934005/115345483-7229fd00-a1e1-11eb-8a9d-43043a83c57c.png)
![image](https://user-images.githubusercontent.com/62934005/115345500-781fde00-a1e1-11eb-92a4-221051535489.png)


