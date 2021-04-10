### 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。

 

示例 1：

```in
输入：s = "We are happy."
```

```out
输出："We%20are%20happy."
```




```java
class Solution {
    public String replaceSpace(String s) {
        if(s.length()==0){
            return s;
        }
        //创建StringBuilder对象res
        StringBuilder res = new StringBuilder();
        
        //遍历字符,判断
        for(Character c : s.toCharArray()){
            if(c==(' ')){
                res.append("%20");
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}
```
