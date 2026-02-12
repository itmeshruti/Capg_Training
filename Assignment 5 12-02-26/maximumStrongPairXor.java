class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i;j<n;j++)
            {
                int xor=0;
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    xor=nums[i]^nums[j];
                    ans=Math.max(ans,xor);
                }
            }
        }
        return ans;
    }
}