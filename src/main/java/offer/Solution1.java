package offer;

/**
 * Created by Administrator on 2016/8/19.
 */
public class Solution1 {

    public static boolean Find(int[][] array, int target) {
        if (target < array[0][0] || target > array[array.length - 1][array.length - 1]) {
            return false;
        }

        int index = binarySearch(array[0], 0, array[0].length - 1, target);

        if (target == array[0][index]) {
            return true;
        }

        int i = binarySearch(array, target < array[0][index] ? index - 1 : index, 0, array.length - 1, target);

        if (target == array[i][index - 1])
            return true;

        index = binarySearch(array, 0, 0, array.length - 1, target);
        if (target == array[index][0])
            return true;

        i = binarySearch(array[index], 0, array[index].length - 1, target);
        if (target == array[index][i])
            return true;

        return false;
    }

    private static int binarySearch(int[] a, int start, int end, int target) {
        int mid = (start + end) / 2;
        if (end == start) return start;
        if (target == a[mid]) return mid;

        return target > a[mid] ? binarySearch(a, mid + 1, end, target) : binarySearch(a, start, mid - 1, target);
    }

    private static int binarySearch(int[][] a, int col, int start, int end, int target) {
        int mid = (start + end) / 2;
        if (end == start) return start;
        if (target == a[mid][col]) return mid;

        return target > a[mid][col] ? binarySearch(a, col, mid + 1, end, target) : binarySearch(a, col, start, mid - 1, target);
    }

    public static void main(String[] args) {
        System.out.println(Find(new int[][]{new int[]{1, 2, 4}, new int[]{3, 4, 5}}, 5));
    }
}
