class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum1=0;
        for(int i=0;i<k;i++)
        {
            sum1+=nums[i];
        }
        int maxsum=sum1;
        for(int i=k;i<n;i++)
        {
            sum1+=nums[i]-nums[i-k];
            maxsum=Math.max(maxsum,sum1);
        }
        return (double)maxsum/k;
    }
}