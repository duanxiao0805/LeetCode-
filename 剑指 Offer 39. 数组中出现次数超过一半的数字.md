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
