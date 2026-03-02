class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int value = 0;
        for(String i:operations){
            if(i.equals("--X") || i.equals("X--")){
                value=value-1;
            } else if(i.equals("++X") || i.equals("X++")){
                value=value+1;
            }
        }
        return value;
    }
}