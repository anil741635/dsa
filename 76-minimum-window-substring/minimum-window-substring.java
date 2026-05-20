class Solution {
    public String minWindow(String s, String t) {
        int  len=Integer.MAX_VALUE;
        int[] maps=new int[256];
        int[] mapt=new int[256];
        for(int i=0;i<t.length();i++) mapt[t.charAt(i)]++;
        int left=0,right=0,minstart=0;
        for(;right<s.length();right++){
            maps[s.charAt(right)]++;
            while(contains(maps,mapt)){
                if(right-left+1<len){
                    len=right-left+1;
                    minstart=left;
                }
                maps[s.charAt(left++)]--;
            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(minstart,minstart+len);
    }
    public static boolean contains(int[] maps,int[] mapt){
        for(int i=0;i<256;i++){
            if(mapt[i]>maps[i]) return false;
        }
        return true;
    }
}