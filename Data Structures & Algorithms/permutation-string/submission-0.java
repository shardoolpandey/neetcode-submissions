class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        for(int i=0;i<=l2-l1;i++)
        {
            String str=s2.substring(i,i+l1);
            if(anagram(s1,str))
            {
                return true;

            }
        }
        return false;
    }
    public boolean anagram(String s1,String str)
    {
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int i=0;i<s1.length();i++)
        {
            int a=s1.charAt(i)-'a';
            freq1[a]=freq1[a]+1;
            int b=str.charAt(i)-'a';
            freq2[b]=freq2[b]+1;
        }
        for(int i=0;i<26;i++)
        {
            if(freq1[i]!=freq2[i])
            {
                return false;
            }
        }
        return true;
    }
}
