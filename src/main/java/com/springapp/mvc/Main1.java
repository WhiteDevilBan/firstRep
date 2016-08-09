package com.springapp.mvc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        test1();
//        test2();
//        test3();
        test4();
    }

    private static void test4() {
        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
        int day = scanner.nextInt();

        int num = fin(day);

        System.out.println(num);
    }

       private static int fin(int day) {
        if (day == 1) {
            return 1;
        }
        return (fin(day -1)+1) *2;
    }


    private static List<String> gone = new ArrayList<String>();

    private static void test3() {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int row = Integer.parseInt(s.split(" ")[0]);
        int col = Integer.parseInt(s.split(" ")[1]);

        char[][] maze = new char[row][col];
        String word = scanner.nextLine();


        for (int i = 0; i < row; i++) {
            String rowStr = scanner.nextLine();
            for (int j = 0; j < col; j++) {
                maze[i][j] = rowStr.charAt(j);
            }
        }
        char w = word.charAt(0);
        boolean f = false;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (maze[i][j] == w) {
                    gone.add(i + "," + j);
                    f = findNext(maze, i, j, 1, word);
                }
            }
        }
        if (f) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean findNext(char[][] maze, int i, int j, int count, String word) {
        if (count == word.length()) {
            return true;
        }
        try{
            //��
            if (!hasGone(i - 1, j) && maze[i - 1][j] == word.charAt(count)) {
                return findNext(maze, i - 1, j, ++count, word);
            }
        } catch (Exception e){}
        try{
            //��
            if (!hasGone(i + 1, j) && maze[i + 1][j] == word.charAt(count)) {
                return findNext(maze, i + 1, j, ++count, word);
            }
        } catch (Exception e){}
        try{
            //��
            if (!hasGone(i, j - 1) && maze[i][j - 1] == word.charAt(count)) {
                return findNext(maze, i, j - 1, ++count, word);
            }
        } catch (Exception e){}
        try{
            //��
            if (!hasGone(i, j + 1) && maze[i][j + 1] == word.charAt(count)) {
                return findNext(maze, i, j + 1, ++count, word);
            }
        } catch (Exception e){}

        return false;
    }

    private static boolean hasGone(int i, int j) {
        if (gone.contains(i + "," + j)) {
            return true;
        }
        return false;
    }

    private static void test2() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean[] state = new boolean[num + 1];
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                if (j % i == 0) {
                    state[j] = !state[j];
                }
            }
        }
        int sum = 0;
        for (boolean f : state) {
            if (f) {
                sum++;
            }
        }
        System.out.println(sum);
    }

    private static void test1() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");
        int[] i = changeToInt(a);
        boolean f = false;

        for (int grade : i) {
            if (grade < 60) {
                f = true;
            }
        }
        if (!f) {
            System.out.println(60);
            System.exit(0);
        }

        Arrays.sort(i);

        System.out.println(i[4] / 10 * 10);

    }

    private static int[] changeToInt(String[] a) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        return arr;
    }

}