// Last updated: 1/13/2026, 4:11:36 PM
1class Solution {
2    public int[] intersect(int[] nums1, int[] nums2) {
3        Map<Integer, Integer>map=new HashMap<>();
4        List<Integer>list=new ArrayList<>();
5        for(int num:nums1){
6            map.put(num,map.getOrDefault(num,0)+1);
7        }
8        for(int num:nums2){
9            if(map.containsKey(num)&&map.get(num)>0){
10                list.add(num);
11                map.put(num,map.get(num)-1);
12            }
13        }
14            int res[]=new int[list.size()];
15            for(int i=0;i<list.size();i++){
16              res[i]=  list.get(i);
17            }
18             return res;
19        
20        
21        
22        
23    }
24   
25}