class Solution {
    public int trap(int[] height) {
        int arr[]=height;
        int n=arr.length;
        if (n < 3) return 0;
        int sum=0;
        int maxL=arr[0];
        int maxR=arr[n-1];
        int L=1;
        int R=n-2;
        while(L<=R)
        {
        if(maxL<=maxR)
            {
                if(maxL-arr[L]>0)
                {
                    sum+=maxL-arr[L];
                }
                maxL=Math.max(maxL,arr[L]);
                L++;
            }
          else
            {
                if(maxR-arr[R]>0)
                {
                    sum+=maxR-arr[R];
                }
                maxR=Math.max(maxR,arr[R]);
                R--;
            }
        }
        return sum;
    }
}