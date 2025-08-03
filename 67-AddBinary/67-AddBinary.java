// Last updated: 8/3/2025, 8:39:09 PM
class Solution {
    public String addBinary(String a, String b) {
        
        StringBuilder sb=new StringBuilder();
        int c=a.length()-1, d=b.length()-1, carry=0;
        while(c>=0 || d>=0 || carry> 0){
            int sum=carry;
            if(c>=0) sum+=a.charAt(c--)-'0';
            
            if(d>=0) sum+=b.charAt(d--)-'0';
            sb.append(sum%2);
            carry=sum/2;
        }
        // if(carry!=0){
        //     sb.append(carry);
        // }
        return sb.reverse().toString();
    }
}
// class Solution {
//     public String addBinary(String a, String b) {
//         StringBuilder result = new StringBuilder();
//         int i = a.length() - 1, j = b.length() - 1, carry = 0;

//         while (i >= 0 || j >= 0 || carry > 0) {
//             int sum = carry;
            
//             if (i >= 0) sum += a.charAt(i--) - '0'; // Convert char to int
//             if (j >= 0) sum += b.charAt(j--) - '0'; // Convert char to int

//             result.append(sum % 2);  // Append 0 or 1 to the result
//             carry = sum / 2;  // Carry is 1 if sum is 2 or 3
//         }

//         return result.reverse().toString(); // Reverse and return the result
//     }
// }