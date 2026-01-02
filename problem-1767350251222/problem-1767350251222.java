// Last updated: 1/2/2026, 4:07:31 PM
1class Solution {
2    public int repeatedNTimes(int[] nums) {
3        Set<Integer>s=new HashSet<>();
4        for( int num:nums){
5            if(!s.add(num)){
6                return num;
7            }
8        }
9        return -1;
10        
11    }
12}
13//int fre[]=new int [1000]; for(int nums;numd)freq[nums]++;if(freq[num]==2){retun nums;}}}return -1;