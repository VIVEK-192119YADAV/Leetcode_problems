// Last updated: 11/9/2025, 11:39:38 PM
class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int[][] arr_2d=new int[plantTime.length][2];
        for(int i=0;i<plantTime.length;i++){
            arr_2d[i][0]=plantTime[i];
            arr_2d[i][1]=growTime[i];

        } 
        Arrays.sort(arr_2d, (a, b) -> b[1] - a[1]);
        int maxgloomtime = 0;
        int prevdays=0;
        for(int i=0;i<plantTime.length;i++){
            int currplanttime =arr_2d[i][0];
            int currgrowtime =arr_2d[i][1];
            int sum = prevdays+currplanttime+currgrowtime;
            prevdays=prevdays+currplanttime;
            maxgloomtime =Math.max(maxgloomtime,sum);
        }
        return maxgloomtime;
        
    }
}