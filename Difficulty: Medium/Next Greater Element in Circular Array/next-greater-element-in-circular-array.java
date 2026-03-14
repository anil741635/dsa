class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=2*n;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n]){
                st.pop();
            }
           if(i<n) list.add(st.isEmpty()?-1:st.peek());
            st.push(arr[i%n]);
        }
        Collections.reverse(list);
        return list;
    }
}