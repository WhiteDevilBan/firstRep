package offer;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Administrator on 2016/8/19.
 */
public class Solution {

    public static String replaceSpace(StringBuffer str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 32) sb.append("%20");
            else sb.append(c);
        }

        return sb.toString();
    }

    public static int NumberOf1(int n) {
        String hex = Integer.toBinaryString(n);
        int num =0;
        for (int i = 0; i < hex.length(); i++) {
            if(hex.charAt(i) == '1') num++;
        }
        System.out.println(hex + " "+ num);
        return num;
    }

    public static void main(String[] args) {
//        System.out.println(replaceSpace(new StringBuffer("We Are Happy")));
        System.out.println(NumberOf1(-1));
        ArrayList<Integer> list = new ArrayList<Integer>();
    }

}
