class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list=new ArrayList<>();
        char[] ch2=p.toCharArray();
        Arrays.sort(ch2);
        for(int i=0;i<=s.length()-p.length();i++){
            String right=s.substring(i,i+p.length());
            if(equal(ch2,right)) list.add(i);
        }
        return list;
    }
    public static boolean equal(char[] s1,String s2){
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch2);
        return Arrays.equals(s1,ch2);
    }
}