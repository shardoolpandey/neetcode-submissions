class Solution {
    public int lengthOfLongestSubstring(String s) {
        int freq[]=new int[256];
        int l=0;
        int r=0;
        int n=s.length();
        int max=0;
        while(r<n)
        {
            int ch=s.charAt(r);
            if(freq[ch]==0)
            {
                freq[ch]=freq[ch]+1;
                max=Math.max(max,r-l+1);
                r++;
            }
            else
            {
                while(s.charAt(l)!=s.charAt(r))
                {
                    int c=s.charAt(l);
                    freq[c]=0;
                    l++;
                }
                freq[s.charAt(l)]=0;
                l++;
            }
        }
        return max;
    }
}
