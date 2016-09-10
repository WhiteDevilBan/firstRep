package huawei;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/17.
 */
public class Test {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str1 = in.nextLine();
            String str2 = in.nextLine();
            int len = 0;
            int len1 = str2.length();
            int len2 = str1.length();
            int[][] dp = new int[len1 + 1][len2 + 1];
            /**
             ?* dp[i][j] str1的前i个元素和str2的前j个元素构成的元素的编辑距离
             ?*/
            for (int i = 0; i < len1 + 1; i++) {
                dp[i][0] = i;
            }
            for (int j = 0; j < len2 + 1; j++) {
                dp[0][j] = j;
            }
            for (int i = 1; i < len1 + 1; i++) {
                for (int j = 1; j < len2 + 1; j++) {
                    int one = dp[i - 1][j] + 1, two = dp[i][j - 1] + 1, three = dp[i - 1][j - 1];
                    if (str1.charAt(j - 1) != str2.charAt(i - 1))
                        three++;
                    dp[i][j] = min(min(one, two), three);
                }
            }
            System.out.println(dp[len1][len2]);
        }
        in.close();
    }

    private static int min(int one, int two) {
        // TODO Auto-generated method stub
        if (one < two) {
            return one;
        } else {
            return two;
        }
    }
}
