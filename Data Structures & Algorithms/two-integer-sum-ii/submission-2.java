class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        while(i < numbers.length-1){
        for(int j=i;j<numbers.length;j++){
            if(i!=j && numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
        }
        i++;
        }
        return new int[]{};
    }
}
