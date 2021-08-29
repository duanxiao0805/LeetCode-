```java
class Solution {
    int[] nums = new int[26]; 
    public boolean isAlienSorted(String[] words, String order) {
        // 用数组模拟哈希表,表示字符的权重
        for (int i = 0; i < order.length(); i++) {
            nums[order.charAt(i) - 'a'] = i;
        }
        for (int i = 1; i < words.length; i++) {
            if (compare(words[i - 1], words[i]) > 0) {
                return false;
            }
        }
        return true;
    }
    // 比较的方法
    public int compare(String a, String b) {
        int result = 0;
        int i = 0;
        int j = 0;
        while (i < a.length() && j < b.length() && result == 0) {
            result = nums[a.charAt(i) - 'a'] - nums[b.charAt(j) - 'a'];
            i++;
            j++;
        }
        //如果result最后是0,说明他们短的那个字符串和长的字符串前面对应相等
        //那么比较的就是长度了
        //举个例子:apple app
        //其实第二个app可以理解为app+空集合+空集合  
        //那么肯定l和e都比空集合的权重大
        //这个问题就可以抽象为--->如果权重只满足小的相等,那么他们的result就是长度之差
        if (result == 0) {
            return a.length() - b.length();
        }
        return result;
    }
}
```
