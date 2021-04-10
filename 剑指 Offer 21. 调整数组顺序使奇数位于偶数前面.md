### 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数位于数组的前半部分，所有偶数位于数组的后半部分。

 

示例：

输入：

```in
nums = [1,2,3,4]
```

输出：

```out
[1,3,2,4] 
```


注：[3,1,2,4] 也是正确的答案之一。
 ```Java
class Solution {
    public int[] exchange(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            while(l<r&&nums[r]%2==0) r--;
            while(l<r&&nums[l]%2==1)  l++;
            if(l<r){
                //交换位置
                int temp=nums[r];   //中间变量
                nums[r]=nums[l];    
                nums[l]=temp;
            }
        }
        return nums;
}
}
```
