// Last updated: 8/3/2025, 8:40:39 PM
class Solution {
    public int reverse(int x){
        int reversed_num=0;
        while(x!=0){
            int l_d=x%10;
            if(reversed_num > Integer.MAX_VALUE/10 ||(reversed_num==Integer.MAX_VALUE/10 &&l_d>7)){
                return 0;}
                if(reversed_num<Integer.MIN_VALUE/10||(reversed_num==Integer.MIN_VALUE/10 &&l_d<-8)){
                    return 0;
                }
                reversed_num=reversed_num*10+l_d;
                x/=10;
        }
        return reversed_num;
    }
}
    


                