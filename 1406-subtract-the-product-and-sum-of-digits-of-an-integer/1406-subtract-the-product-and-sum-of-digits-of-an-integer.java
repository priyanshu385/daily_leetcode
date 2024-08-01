class Solution {
    public int subtractProductAndSum(int n) {
        long sum=0;
        long pro=1;
        while(n>0)
        {
            sum+=n%10;
            pro*=n%10;
            n/=10;
        }
        int dff=(int) (pro-sum);
        return dff;
    }
}