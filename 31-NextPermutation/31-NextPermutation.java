// Last updated: 3/25/2026, 11:40:12 PM
1class Solution {
2    public void nextPermutation(int[] nums) {
3
4        int idx = -1;
5
6        // Step 1: Find break point
7        for(int i = nums.length - 2; i >= 0; i--){
8            if(nums[i] < nums[i + 1]){
9                idx = i;
10                break;
11            }
12        }
13
14        // Step 2: If no break point, reverse whole array
15        if(idx == -1){
16            reverse(nums, 0, nums.length - 1);
17            return;
18        }
19
20        // Step 3: Find just greater element and swap
21        for(int j = nums.length - 1; j > idx; j--){
22            if(nums[j] > nums[idx]){
23                swap(nums, j, idx);
24                break;
25            }
26        }
27
28        // Step 4: Reverse remaining part
29        reverse(nums, idx + 1, nums.length - 1);
30    }
31
32    private void swap(int[] nums, int i, int j){
33        int temp = nums[i];
34        nums[i] = nums[j];
35        nums[j] = temp;
36    }
37
38    private void reverse(int[] nums, int start, int end){
39        while(start < end){
40            swap(nums, start, end);
41            start++;
42            end--;
43        }
44    }
45}