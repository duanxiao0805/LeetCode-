### 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。

**示例1:**

输入: 
```
nums = [-2,1,-3,4,-1,2,1,-5,4]
```
输出:
```
6
```

**解释:**
连续子数组 [4,-1,2,1] 的和最大，为 6。


```js
/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function (nums) {
    const memo = [];
    memo[0] = nums[0];
    for (let i = 1; i < nums.length; i++) {
        memo[i] = Math.max(nums[i] + memo[i - 1], nums[i]);

    }
    let max = nums[0];

    for (let i = 1; i < memo.length; i++) {
        max = Math.max(max, memo[i]);
    }
    return max;
};

```
