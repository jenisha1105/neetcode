class Solution {
    public int[] plusOne(int[] digits) {
       StringBuilder sb=new StringBuilder();
       for(int dig:digits){
          sb.append(dig);
       } 
       long n=Long.parseLong(sb.toString());
       n=n+1;
       String str=String.valueOf(n);
       int[] res=new int[str.length()];
       for(int i=0;i<str.length();i++){
        res[i]=str.charAt(i)-'0';
       }
       return res;
    }
}
