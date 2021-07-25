### 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。

 

示例:

输入: 

```in
1->2->3->4->5->NULL
```

输出:

```out
 5->4->3->2->1->NULL
```




```Java
//Definition for singly-linked list.
 public class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {val = x; }
 }
class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack= new Stack<ListNode>();
        ListNode temp=head;
        while(temp!=null){
            stack.push(temp);
            temp=temp.next;
        }
        int size=stack.size();
        int []print=new int [size];
        for(int i=0;i<size;i++){
            print[i]=stack.pop().val;
        }
        return print;
    }
}
```
