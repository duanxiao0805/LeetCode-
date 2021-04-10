### 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  

示例 1：

输入：

```in
[3,4,5,1,2]
```


输出：

```out
1
```


示例 2：

输入：

```in
[2,2,2,0,1]
```

输出：

```out
0
```
```Java
class Solution {
    public int minArray(int[] numbers) {
        int l=0,r=numbers.length-1;
        //左右指针指向数据的两端
        //找最小值
        while(l<r){
            int mid=(l+r)/2;
            if(numbers[mid]>numbers[r]){
                l=mid+1;
            }else if(numbers[mid]<numbers[r]){
                r=mid;
            }
            else{
                r--;
            }
        }
        return numbers[l];
    }
}
```
