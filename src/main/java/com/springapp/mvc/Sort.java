package com.springapp.mvc;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2016/7/14.
 */
public class Sort {

    private static int MAX = 10;
    private static int MAX1 = 1000 * 100;

    public static void main(String[] args) {

        int[] arr = new int[MAX];

        initArr(arr);
//        //插入
//        long insertStart = System.currentTimeMillis();
//        insertSort(Arrays.copyOf(arr,arr.length));
//        long insertEnd = System.currentTimeMillis();
//        System.out.println("insertSort " + (insertEnd - insertStart) + "ms");
//        print(arr);

        //冒泡
        long bubbleStart = System.currentTimeMillis();
        bubbleSort(arr);
        long bubbleEnd = System.currentTimeMillis();
        System.out.println("bubbleSort " + (bubbleEnd - bubbleStart) + "ms");
        print(arr);
//
//        //选择
//        long chooseStart = System.currentTimeMillis();
//        chooseSort(Arrays.copyOf(arr,arr.length));
//        long chooseEnd = System.currentTimeMillis();
//        System.out.println("chooseSort " + (chooseEnd - chooseStart) + "ms");
////        print(arr);
//
//        //快速排序
//        long quickStart = System.currentTimeMillis();
//        quickSort(Arrays.copyOf(arr,arr.length),0, arr.length -1);
//        long quickEnd = System.currentTimeMillis();
//        System.out.println("quickSort " + (quickEnd - quickStart) + "ms");
////        print(arr);


        //归并排序
//        long mergeStart = System.currentTimeMillis();
//        arr = mergeSort(Arrays.copyOf(arr,arr.length), 0, arr.length-1);
//        long mergeEnd = System.currentTimeMillis();
//        System.out.println("mergeSort " + (mergeEnd - mergeStart) + "ms");
////        print(arr);
//        Test test = new Test();
    }

    private static int[] mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return new int[]{arr[end]};
        }
        int mid = (start + end)/2;
        int[] a1 = mergeSort(arr, start, mid);
        int[] a2 = mergeSort(arr, mid + 1, end);
        return merge(a1, a2, start, mid, end);
    }

    private static int[] merge(int[] a1, int[] a2, int start, int mid, int end) {
        int[] arr = new int[end - start + 1];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a1.length && j < a2.length) {
            if(a1[i] < a2[j]) {
                arr[k++] = a1[i++];
            } else {
                arr[k++] = a2[j++];
            }
        }
        while (i < a1.length) {
            arr[k++] = a1[i++];
        }

        while (j < a2.length) {
            arr[k++] = a2[j++];
        }

        return arr;
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (end > start) {
            int temp = arr[start];
            int i = start;
            int j = end;

            while (j > i) {
                while (j > i && temp < arr[j]) {
                    j--;
                }
                if (j > i) {
                    arr[i] = arr[j];
                    i++;
                }
                while (j > i && temp > arr[i]) {
                    i++;
                }
                if (j > i) {
                    arr[j] = arr[i];
                    j--;
                }

            }
            if (end > start) {
                arr[j] = temp;
                quickSort(arr, start, j - 1);
                quickSort(arr, j + 1, end);
            }
        }
        return;
    }

    private static void chooseSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int k = i;
            int temp = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (temp > arr[j]) {
                    k = j;
                    temp = arr[j];
                }
            }
            arr[k] = arr[i];
            arr[i] = temp;
        }
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean f = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    f = true;
                }
            }
            if (!f) break;
        }
    }

    private static void print(int[] arr) {
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j = i - 1;
                while (j >= 0 && temp < arr[j]) {
                    arr[j + 1] = arr[j];
                    j--;
                }
                arr[j + 1] = temp;
            }
        }
    }

    private static void initArr(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
    }

}
