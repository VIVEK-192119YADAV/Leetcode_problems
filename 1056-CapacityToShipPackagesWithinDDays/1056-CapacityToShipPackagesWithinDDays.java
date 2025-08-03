// Last updated: 8/3/2025, 8:37:58 PM
class Solution {
    public int shipWithinDays(int[] weights, int days) {
       return sol(weights,days);
    }
    public static int sol(int arr[],int days)
    {
        int lo=1;
        int hi=0;
        for(int i=0;i<arr.length;i++)
        {
            hi=hi+arr[i];
        }
        int ans=0;
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            if(isPossible(arr,mid,days))
            {
                ans=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        return ans;

    }
    public static boolean isPossible(int arr[],int mid,int day)
    {
        int cnt=1;
        int cap=mid;
        for(int i=0;i<arr.length;)
        {
            if(cap>=arr[i])
            {
                cap=cap-arr[i];
                i++;
            }
            else{
cnt+=1;
cap=mid;
            }
            if(cnt>day)return false;
        }
        return true;
    }
       
}