class Solution {
    public int evalRPN(String[] tokens) {
       Stack<Integer>st=new Stack<>();
       for(String str:tokens){
          try{
            int n=Integer.parseInt(str);
            st.push(n);
          }catch(NumberFormatException e){
               int b=st.pop();
               int a=st.pop();
            switch(str){
            case "+":
               st.push(a+b);
               break;
            case "-":
                st.push(a-b);
                break;
            case "*":
                st.push(a*b);
                break;
            case "/":
                 st.push(a/b);
                 break;
            }
          
        } 
       }
       return st.pop();
    }
}
