package didi;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public static void main(String[] args) {
//        reOrderArray(new int[]{1, 3, 6, 5, 7, 3, 6, 8});
        int[][] a = new int[][]{new int[]{1,2,3,4},new int[]{5,6,7,8},new int[]{9,10,11,12},new int[]{13,14,15,16}};
        a = new int[][]{{1},{2},{3},{4},{5}};
        a = new int[][]{{1,2,3,4,5}};
        printMatrix(a);
    }

    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) return 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return array[i + 1];
        }
        return array[0];
    }

    public static double Power(double base, int exponent) {
        int result = 1;
        int m = exponent;
        if (exponent < 0) {
            exponent = -exponent;
        }
        while (exponent > 0) {
            if ((exponent & 1) == 1) {
                result *= base;
            }
            base *= base;
            exponent >>= 1;
        }

        return m > 0 ? result : 1.00 / result;
    }

    public static void reOrderArray(int[] array) {
        Queue ji = new ArrayDeque();
        Queue ou = new ArrayDeque();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                ou.add(array[i]);
            } else {
                ji.add(array[i]);
            }
        }
        int j = ji.size();
        for(int i=0;i<j;i++){
            array[i] = (int) ji.poll();
        }
        int o = ou.size();
        for(int i=j;i<j+o;i++){
            array[i] = (int) ou.poll();
        }

    }


    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int row=matrix.length;
        int col =matrix[0].length;
        int c= ((row < col?row:col) + 1)/2;
        for(int i=0;i<c;i++){
            //ио
            for(int j=i;j<col-i;j++){
                list.add(matrix[i][j]);
            }
            //ср
            for(int j=i+1;j<row-i;j++){
                list.add(matrix[j][col-i-1]);
            }
            //об
            if(row>1){
                for(int j=col-2-i;j>=i;j--){
                    list.add(matrix[row-i-1][j]);
                }
            }
            //вС
            if(col >1){
                for(int j=row-2-i;j>=i+1;j--){
                    list.add(matrix[j][i]);
                }
            }

        }
        return list;
    }

}