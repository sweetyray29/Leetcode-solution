class Solution {
    public String removeDuplicates(String s) {
        int len=s.length();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<len;i++){
            if(sb.length()==0){
                sb.append(s.charAt(i));
            }
            else if(sb.charAt(sb.length()-1)==s.charAt(i)){
                sb.deleteCharAt(sb.length()-1);
            }
            else{
                sb.append(s.charAt(i));
            }
        }
        s=sb.toString();
        return s;
    }
}
