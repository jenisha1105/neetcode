class Solution {
    public boolean isPalindrome(String s) {
    StringBuilder sb=new StringBuilder();
    for(char ch:s.toCharArray()){
        if(Character.isLetterOrDigit(ch)){
            sb.append(ch);
        }
    }
    String temp=sb.toString();
    String str=sb.reverse().toString();
    if(temp.equalsIgnoreCase(str))
        return true;
    return false;
    }
}
