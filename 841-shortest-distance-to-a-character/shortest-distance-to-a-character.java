class Solution {
    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) list.add(i);
        }
        int[] ans=new int[s.length()];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c) ans[i]=0;
            else {
                int index=Integer.MAX_VALUE;
                for(int j=0;j<list.size();j++){
                    index=Math.min(index,Math.abs(i-list.get(j)));
                }
                ans[i]=index;
            }
        }
        return ans;
    }
}