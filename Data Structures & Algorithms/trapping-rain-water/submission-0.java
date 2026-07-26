class Solution {
    public int trap(int[] height) {
        int arr[]=height;
        int n=arr.length;
        int maxLeft[]=new int[n];
        int maxRight[]=new int[n];
        int maxL=arr[0];
        int maxR=arr[n-1];
        for(int i=1;i<n;i++)
        {
            maxLeft[i]=maxL;
            maxL=Math.max(maxL,arr[i]);
        }
        for(int i=n-2;i>=0;i--)
        {
            maxRight[i]=maxR;
            maxR=Math.max(maxR,arr[i]);
        }
        int min[]=new int[n];
        for(int i=0;i<n;i++)
        {
            min[i]=Math.min(maxLeft[i],maxRight[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            if(min[i]-arr[i]>0)
            {
                ans+=min[i]-arr[i];
            }
        }
        return ans;
    }
}
