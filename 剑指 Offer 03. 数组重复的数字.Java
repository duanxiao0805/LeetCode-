//输出任意一个重复数字
//哈希的思想
找出数组中重复的数字。


在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

class Solution {
    public int findRepeatNumber(int[] nums) {
        int temp[]=new int[nums.length];
        //给数组b全部赋值-1
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

