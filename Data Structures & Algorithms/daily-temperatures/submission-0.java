class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int count=0;
        int length=temperatures.length;
        int[] res=new int[length];
        Stack<Integer>st=new Stack<>();
        for(int i=0;i<length;i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int prev=st.pop();
                res[prev]=i-prev;
            }
            st.push(i);
        }
        return res;
    }
}
