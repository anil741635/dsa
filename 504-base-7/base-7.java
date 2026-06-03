class Solution {
    public String convertToBase7(int num) {
        boolean flag=false;
        if(num<0) flag=true;
        if(num==0) return new String("0");
        int nums=Math.abs(num);
       ArrayList<Integer> list=new ArrayList<>();
       while(nums>0){
        int last=nums%7;
        nums=nums/7;
        list.add(last);
       } 
       StringBuilder sb=new StringBuilder();
       if(flag) sb.append("-");
       for(int i=list.size()-1;i>=0;i--){
        sb.append(list.get(i));
       }
       return sb.toString();
    }
}