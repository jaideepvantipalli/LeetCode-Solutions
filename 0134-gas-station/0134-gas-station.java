class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0,tank=0,start=0;
        int n=gas.length;
        for(int i=0;i<n;i++){

            int gain=gas[i]-cost[i];

            totalgas+=gain;

            tank+=gain;

            if(tank < 0){
                start=i+1;
                tank=0;
            }
        }

        if(totalgas<0) return -1;

        return start;
    }
}