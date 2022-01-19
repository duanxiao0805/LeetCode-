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
