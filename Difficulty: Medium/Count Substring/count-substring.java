class Solution {
    public static int countSubstring(String s) {
        // code here
        int n=s.length(),res=0;
        int lastA=-1,lastB=-1,lastC=-1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                lastA=i;
            }
             else if(s.charAt(i)=='b'){
                lastB=i;
            }
            else{
                lastC=i;
            }
            int minlist=Math.min(lastA,Math.min(lastB,lastC));
            if(minlist!=-1) res+=minlist+1;
        }
        return res;
    }
}
