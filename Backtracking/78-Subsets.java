class Solution {
    public static void ss(int i,int[] nums,List<List<Integer>> ans,List<Integer> list){
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        ss(i+1,nums,ans,list);
        list.add(nums[i]);
        ss(i+1,nums,ans,list);
        list.remove(list.size()-1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ss(0,nums,ans,new ArrayList<>());
        return ans;
    }
}
