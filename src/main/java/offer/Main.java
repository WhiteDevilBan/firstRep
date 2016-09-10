package offer;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/2.
 */
public class Main {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int totalWeight = scanner.nextInt();
//        int totalNum = scanner.nextInt();
//        scanner.nextLine();
//        int[] weight = new int[totalNum];
//        int[] value = new int[totalNum];
//
//        for (int i = 0; i < totalNum; i++) {
//            weight[i] = scanner.nextInt();
//        }
//        scanner.nextLine();
//        for (int i = 0; i < totalNum; i++) {
//            value[i] = scanner.nextInt();
//        }
//
//        System.out.println(max(0, totalWeight, weight, value)/10.0);


//        System.out.println(calcDistance(100, 90, 80, 70));
        System.out.println(countWays(6));
    }

    public static int calcDistance(int A, int B, int C, int D) {
        // write code here
        return (int) (h(A) + h(B) + h(C) + h(D));
    }

    private static float h(float height) {
        float sum = height;
        while (height > 0) {
            sum += height;
            height /= 2.0;
        }
        return sum;
    }

    public static int countWays(int n) {
        n -= 1;
        // write code here
        if (n <= 0) {
            return 0;
        }
        int one = countWays(n - 1) + 1;
        int two = n - 2 < 0 ? 0 : countWays(n - 2) + 1;
        return (one + two) % 1000000007;
    }

    private static int max(int i, int totalWeight, int[] weight, int[] value) {
        if (i > weight.length - 1 || totalWeight - weight[i] < 0) {
            return 0;
        }
        int a = max(i + 1, totalWeight, weight, value);
        int b = value[i] + max(i + 1, totalWeight - weight[i], weight, value);
//        System.out.println(i + " " + a + " " + b);
        return a > b ? a : b;
    }
}
