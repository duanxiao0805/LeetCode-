```java
//数组模拟哈希表
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] counts = new int[26];
        if (s.length() != t.length() || s.equals(t)) {
            return false;
        }
        for (char c : s.toCharArray()) {
            counts[c - 'a']++; // 下标代表字符,统计出现的次数
        }

        for (char c : t.toCharArray()) {
            if (counts[c - 'a'] == 0) {
                return false;
            }
            counts[c - 'a']--;
        }
        return true;
    }
}
