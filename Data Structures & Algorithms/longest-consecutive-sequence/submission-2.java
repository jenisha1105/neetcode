class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
        HashSet<Integer> set = new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int longest=0;
        for(int x:set){
           if(!set.contains(x-1)){
             int count=1;
             int curr=x;
           while(set.contains(curr+1)){
            count++;
            curr++;
           }
           longest = Math.max(longest, count);
        }
        }
        return longest;
    }
}
