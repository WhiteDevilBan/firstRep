package tsz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/10.
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List list = new ArrayList();
        String a = "";
        while (in.hasNext()) {
            String[] s = in.nextLine().split(" ");
            for (String str : s) {
                list.add(Integer.parseInt(str));
            }

            System.out.println(max(list, 5, 0));
            list.clear();
        }
    }

    private static int max(List list, int index, int i) {
        if (i < 0 || i >= list.size() || index < 0 || index > 10) return 0;
        int sum;

        int m = (int) list.get(i);
        if(m<index-1) sum = max(list,index -1,i+1);
        else if(m>index+1) sum = max(list,index+1,i+1);
        else sum = 1+ max(list, m, i+1);
        return sum;
    }
}
