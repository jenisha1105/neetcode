class Solution {
    public int missingNumber(int[] nums) {
        int ogsum=0;
        int sum=0;
        int n=nums.length;
        for(int i=1;i<=n;i++){
           ogsum+=i;
        }
        for(int j:nums){
            sum+=j;
        }
        return (ogsum==sum)?0:ogsum-sum;
    }
}
