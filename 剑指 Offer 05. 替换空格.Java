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
