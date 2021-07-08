**数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。**

**示例 1:**

输入: 
```
[1, 2, 3, 2, 2, 2, 5, 4, 2]
```
输出:
```
2
```

```java
class Solution {
    public int majorityElement(int[] nums) {
        int temp = nums[0];
        int count = 0;
        for (int num: nums
             ) {
            if (num == temp) {
                count++;
            }else {
                count--;
            }
            if (count == 0) {
                temp = num;
                count = 1;
            }
        }
        return temp;
    }
}

```
