class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<Integer> ds=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        f(nums,0,ds,ans,n);
        return ans;
    }
    public void f(int arr[],int i,List<Integer> ds,List<List<Integer>> ans,int n)
    {
        if(i==n)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        ds.add(arr[i]);
        f(arr,i+1,ds,ans,n);
        ds.remove(ds.size()-1);
        f(arr,i+1,ds,ans,n);
    }
}
