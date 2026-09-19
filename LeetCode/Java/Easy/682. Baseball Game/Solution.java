class Solution {
    public int calPoints(String[] operations) {
        int len=operations.length;
        int[] arr=new int[len];
        int j=0;
        int s=0;
        for(int i=0;i<len;i++){
            if(operations[i].equals("C")){
                j--;
            }
            else if(operations[i].equals("D")){         
                arr[j]=arr[j-1]*2;
                j++;
            }
            else if(operations[i].equals("+")){
                arr[j]=arr[j-1]+arr[j-2];
                j++;
            }
            else{
                arr[j]=Integer.parseInt(operations[i]);
                j++;
            }
        }
        for(int i=0;i<j;i++){
            s=s+arr[i];
        }
        return s;
    }
}