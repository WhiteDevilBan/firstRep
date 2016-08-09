package com.springapp.mvc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/7/25.
 */
public class Main {
    private static List list = new ArrayList();

    private static List<Integer> visit = new ArrayList();
    private static List<Integer> no = new ArrayList();

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();
    }

    private static void test3() {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            String[] row = scanner.nextLine().split(" ");
            arr[i] = changeToInt(row);
        }

        visit.add(0);
        for (int i = 1; i < n; i++) {
            no.add(i);
        }
        int sum = 0;

        while (!no.isEmpty()) {
            int min = Integer.MAX_VALUE;
            int minV = 0;
            for (int i = 0; i < visit.size(); i++) {
                //对每个已加入的点遍历
                int v = visit.get(i);
                for (int x = 0; x < n; x++) {
                    if (visit.contains(x)) continue;
                    //找到v出发的边里最小的
                    int a = arr[v][x];
                    if (a > 0 && a < min) {
                        min = a;
                        minV = x;
                    }

                }
            }
            sum += min;
            visit.add(minV);
            no.remove(Integer.valueOf(minV));
        }

        System.out.println(sum);
    }

    private static int finMin(int[] arr) {
        int min = 0;
        for (int i : arr) {
            if (i > 0 && i < min)
                min = i;
        }
        return min;
    }

    private static void test2() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String[] str = string.split(",");
        int[] arr = changeToInt(str);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) continue;
                if (arr[i] % arr[j] == 0) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }


    }

    private static int[] changeToInt(String[] str) {
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        return arr;
    }

    private static void test1() {

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        int num = fin(day);

        System.out.println(num);
    }

    private static int fin(int day) {
        if (day == 1) {
            return 1;
        }
        return (fin(day - 1) + 1) * 2;
    }

}
