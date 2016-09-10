package huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2016/8/21.
 */
public class Main2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = Integer.parseInt(in.nextLine());
        for (int i = 0; i < num; i++) {
            String a = in.nextLine();
            String b = in.nextLine();
            System.out.println(min(a, b));
        }
    }

    //dsafsadfadf
    private static int min(String a, String b) {
        List list = new ArrayList();
        for (int i = 0; i < b.length(); i++) {
            for (int j = 0; j < b.length() - i; j++) {
                String m = b.substring(j, i + j + 1);
                System.out.println(m + " " + fun(a, m) + " " + ((j == 0 || j == b.length() - 1 - i) ? 1 + b.length() : 4 + b.length() - m.length()));
                list.add(fun(a, m) + ((j == 0 || j == b.length() - 1 - i) ? 1 + b.length() : 4 + b.length() - m.length()));
            }
        }
        Collections.sort(list);
        return (int) list.get(0);
    }

    private static int fun(String a, String m) {
        int num = 0;
        if (a.contains(m) || a.startsWith(m) || a.endsWith(m)) {
            num += 2;
        } else if (a.contains(m)) {
            num += 4;
        } else {
            num += 2000;
        }
        return num;
    }

}
