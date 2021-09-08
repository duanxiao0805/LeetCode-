例如:

```
 [1,   4,  7, 11, 15]
 [2,   5,  8, 12, 19]
 [3,   6,  9, 16, 22]
 [10, 13, 14, 17, 24]
 [18, 21, 23, 26, 30]
```

在这个二维数组里面找9?

我可以直接从右上角开始找,然后行是递增的,列是递减的

这个大小关系是怎么得出的,没证明出来,只是观察出来的

```
刚开始是15,比9大,然后列-1,为什么不是行+1
因为行+1下面那个数肯定还比15打,因为这个题是递增的
然后一直到7
7比9小,然后行+1
所以这样的行列关系就找出来了
```

```java
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if(matrix.length==0||matrix[0].length==0)
            return false;
        int i = 0;
        int j = matrix[0].length - 1;
        // 初始化位置为右上角
        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }
}
```

