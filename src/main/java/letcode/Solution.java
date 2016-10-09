package letcode;

public class Solution {
    public String decodeString(String s) {
        if(!s.contains("[")) return s;

        int left = s.indexOf("[");
        int right = s.indexOf("]");

        String str = s.substring(left+1,right+1);
        String result = "";
        int dig = 0;
        for(int i=0;i<s.length();i++){
            if(!(s.charAt(i) >='0' && s.charAt(i)<='9')) result += s.charAt(i);
            else {
                dig = i;
                break;
            }
        }
        int num = Integer.parseInt(s.substring(dig,left));
        for(int i=0;i<num;i++){
            result += decodeString(str);
        }
        result += decodeString(s.substring(right+1));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().decodeString("3[a2[c]]"));
    }
}