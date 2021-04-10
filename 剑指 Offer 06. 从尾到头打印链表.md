### 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

 

示例 1：

```in
输入：s = "We are happy."
```

```out
输出："We%20are%20happy."
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
