// Last updated: 8/3/2025, 8:38:19 PM
class Solution {
    public String reverseVowels(String s) {
        List<Character> list = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
        String reqstr=new String("");
        //code
        char charr[]=s.toCharArray();
    int left=0;int right=charr.length-1;
    while(left<right){
        char cleft=s.charAt(left);
        char cright=s.charAt(right);
        if(list.contains(cleft)&&list.contains(cright)){
            charr[left]=cright;
            charr[right]=cleft;
            left++; right--;

        }
    if(!list.contains(cleft)){
        left++;
    }
     if(!list.contains(cright)){
        right--;
    }
    }
    for(char ch : charr){
        reqstr=reqstr.concat(Character.toString(ch));
    }


        return reqstr;
    }
}