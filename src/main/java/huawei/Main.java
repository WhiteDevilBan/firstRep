package huawei;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/22.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int stuNum = scanner.nextInt();
            int queNum = scanner.nextInt();
            int[] grade = new int[stuNum+1];
            for (int i = 0; i < stuNum; i++) {
                grade[i + 1] = scanner.nextInt();
            }
            scanner.nextLine();
            for (int i = 0; i < queNum; i++) {
                String que = scanner.nextLine();
                String q = que.split(" ")[0];
                int a = Integer.parseInt(que.split(" ")[1]);
                int b = Integer.parseInt(que.split(" ")[2]);

                if ("Q".equals(q)) {
                    System.out.println(query(grade, a, b));
                } else if ("U".equals(q)) {
                    update(grade, a, b);
                }
            }
        }

    }

    private static int query(int[] grade, int a, int b) {
        int[] arr = Arrays.copyOfRange(grade, a<b?a:b, (a>b?a:b)+1);
        Arrays.sort(arr);

        return arr[arr.length -1];
    }

    private static void update(int[] grade, int a, int b) {
        grade[a] = b;
    }

}
