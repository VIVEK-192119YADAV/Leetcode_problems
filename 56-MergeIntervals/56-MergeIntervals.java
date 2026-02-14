// Last updated: 2/14/2026, 9:57:57 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
4        List<int[]> list = new ArrayList<>();
5        int last = intervals[0][1];
6        int first = intervals[0][0];
7        for(int i =1; i< intervals.length; i++){
8            if(intervals[i][0] <= last){
9                last = last >= intervals[i][1] ? last : intervals[i][1];
10                // lst.add(first,end);
11                // list.add(lst);
12            }
13            else{
14                list.add(new int[]{first, last});
15                first = intervals[i][0];
16                last = intervals[i][1];
17                // first = intervals[i][0];
18            }
19        }
20        list.add(new int[]{first, last});
21        return list.toArray(new int[list.size()][]);
22    }
23}