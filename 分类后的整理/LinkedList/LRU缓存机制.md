**为什么要用双链表?**
我个人的理解是这样,他只会进行头部插入操作和尾部删除操作(满员的情况下)

**具体思路**
1.哈希表用来获取值和对应的结点
2.链表用来更新最近使用情况

```java
import java.util.HashMap;

class LRUCache {
    HashMap<Integer, ListNode> map;
    ListNode head; // 表示头
    ListNode tail; // 表示尾
    int len;// 表示当前长度

    public LRUCache(int capacity) {
        map = new HashMap<>();
        head = new ListNode(-1, -1);
        tail = new ListNode(-1, -1);
        head.next = tail;
        tail.pre = head;
        this.len = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key) == false) {
            return -1;
        }
        ListNode node = map.get(key);
        moveToTail(node, node.val);

        return node.val;
    }

    private void moveToTail(ListNode node, int val) {
        delete(node);
        node.val = val;
        insertToTail(node);
    }
    public void insertToTail(ListNode node) {
        tail.pre.next = node;
        node.pre = tail.pre;
        node.next = tail;
        tail.pre = node;
    }

    public void delete(ListNode node) {
        node.pre.next = node.next;
        node.next.pre = node.pre;
    }

    public void put(int key, int val) {
        if (map.containsKey(key)) {
            moveToTail(map.get(key), val);
        } else {
            if (map.size() == len) {
                ListNode de = head.next;
                delete(de);
                map.remove(de.key);
            }
            ListNode node = new ListNode(key, val);
            insertToTail(node);
            map.put(key, node);
        }
    }
}
class ListNode {
    int key;
    int val;
    ListNode pre;
    ListNode next;

    public ListNode(int key, int val) {
        this.key = key;
        this.val = val;

    }
}
/**
 * Your LRUCache object will be instantiated and called as such: LRUCache obj =
 * new LRUCache(capacity); int param_1 = obj.get(key); obj.put(key,value);
 */

```

