
##### 找出数组中重复的数字。


在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

示例 1：

```in
输入：
[2, 3, 1, 0, 2, 5, 3]
```



```out
输出：2 或3
```




```Java
class Solution {
    public int findRepeatNumber(int[] nums) {
        int temp[]=new int[nums.length];
        //给数组temp全部赋值-1
        for(int i=0;i<nums.length;i++){
            temp[i]=-1;
        }
        //或者使用
        Arrays.fill(temp,-1);
        for(int i=0;i<nums.length;i++){
            if(temp[nums[i]]!=-1){
                return nums[i];
            }
            
            temp[nums[i]]=i;
        }
        return -1;
    }
}
```
temp是辅助数组,哈希的思想,一一对应
