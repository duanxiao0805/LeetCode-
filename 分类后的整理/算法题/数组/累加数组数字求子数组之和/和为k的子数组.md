这个题应用了前缀和的知识

```java
class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);   //0出现了一次
        int count=0;
        int sum=0;
        //k表示前i个数的区间和,value表示出现的次数
        for(int num:nums){
            sum=sum+num; 
            if(map.containsKey(sum-k)){
                count=count+map.get(sum-k);   //出现前面出现过的次数
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);    //之前出现的这个前缀区间和+1
            }
            else{
                map.put(sum,1);     //这个前缀和+1
            }
        }
        return count;
    }
}
```

怎么理解呢?

