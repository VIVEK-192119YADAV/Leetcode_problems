// Last updated: 1/21/2026, 10:05:45 PM
1// class Solution {
2//     public int findLucky(int[] arr) {
3//         HashMap<Integer,Integer>hm=new HashMap<>();
4//         for(int i=0;i<arr.length;i++){
5//             if(hm.containsKey(arr[i])){
6//                 hm.put(arr[i],hm.get(arr[i])+1);
7//             }
8//             else{
9//                 hm.put(arr[i],1);
10//             }
11//         }
12//         int x=0;
13//         int max=-1;
14//         for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
15//             if(entry.getKey()==entry.getValue()){
16//                 x=entry.getValue();
17//                 max=Math.max(x,max);
18//             }
19//         }
20//         return max;
21        
22//     }
23// }
24import java.util.*;
25
26class Solution {
27    public int findLucky(int[] arr) {
28        HashMap<Integer, Integer> hm = new HashMap<>();
29
30        // Step 1: Count frequency
31        for (int i = 0; i < arr.length; i++) {
32            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
33        }
34
35        // Step 2: Find largest lucky number
36        int max = -1;
37        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
38            if (entry.getKey().equals(entry.getValue())) {
39                max = Math.max(max, entry.getKey());
40            }
41        }
42
43        return max;
44    }
45}
46