class Solution {
    public long subArrayRanges(int[] arr) {
        int n=arr.length;;
        long res=0;
        int[] leftmin=new int[n];
        int[] leftmax=new int[n];
        int[] rightmin=new int[n];
        int[] rightmax=new int[n];
        Stack<Integer> st =new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
                st.pop();
            }
            leftmin[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st.clear();
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            rightmin[i]=st.isEmpty()?n-i:st.peek()-i;
            st.push(i);
        }
        st.clear();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            leftmax[i]=st.isEmpty()?i+1:i-st.peek();
            st.push(i);
        }
        st.clear();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                st.pop();
            }
            rightmax[i]=st.isEmpty()?n-i:st.peek()-i;
            st.push(i);
        }
        st.clear();
        
        for(int i=0;i<n;i++){
            long cntmax=(long)leftmax[i]*rightmax[i];
            long cntmin=(long)leftmin[i]*rightmin[i];
            res+=(cntmax-cntmin)*arr[i];
        }
        return res;
    }
}