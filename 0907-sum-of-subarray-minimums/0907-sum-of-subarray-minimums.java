class Solution {
    public int sumSubarrayMins(int[] arr) {
        int res=0;
        int n=arr.length;
        Stack<Integer> st1=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int left[]=new int[n];
        int right[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st1.isEmpty() && arr[st1.peek()] > arr[i]){
                st1.pop();
            }
            left[i]=st1.isEmpty()?i+1:i-st1.peek();
            st1.push(i);
        }
        
        for(int i=n-1;i>=0;i--){
            while(!st2.isEmpty() && arr[st2.peek()]>=arr[i]){
                st2.pop();
            }
            right[i]=st2.isEmpty()?n-i:st2.peek()-i;
            st2.push(i);
        }
        long answer = 0;

        for (int i = 0; i < n; i++) {

            long contribution =
                    (long) arr[i] * left[i] * right[i];

            answer = (answer + contribution) % 1000000007;
        }

        return (int) answer;
    }
}