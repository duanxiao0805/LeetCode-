```Java
//斐波那契数列应用
class Solution {
    public int numWays(int n) {
        int a=0;    //第一个数a
        int b=1;    //第二个数b
        if(n==0||n==1){
            return 1;
        }
        //取余
        while(n>0){
            int temp=(a+b)%1000000007;
            a=b%1000000007;
            b=temp%1000000007;
            n--;
        }
        return b%1000000007;
    }
}
```
