package tsz;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/10.
 */
public class Main1 implements Cloneable{

    private int a = 10;
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        Main1 m1 = new Main1();
        try {
            Main1 m2 = (Main1) m1.clone();
            m1.a = 100;
            System.out.println(m2.a);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int len = in.nextInt();
        int[] light = new int[num];
        for (int i = 0; i < num; i++) {
            light[i] = in.nextInt();
        }
//        light[num] = 0;
//        light[num + 1] = len;

        Arrays.sort(light);
        int result = 0;
        int start = light[0] - 0;
        int end = len - light[num - 1];
        for (int i = 0; i < light.length - 1; i++) {
            if (light[i + 1] - light[i] > result) {
                result = light[i + 1] - light[i];
            }
        }
        int b = (start > end ? start : end) * 2;
        result = result > b ? result : b;
        System.out.printf("%.2f", result / 2.0);

    }
}
