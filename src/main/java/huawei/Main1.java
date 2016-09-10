package huawei;

import java.net.URLConnection;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/15.
 */
public class Main1 {

    private static final String IPCP = "21 80 ";
    private static final String LCP = "21 c0 ";
    private static final String PAP = "23 c0 ";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String pro = input[0];
        int len = Integer.parseInt(input[1]);
        System.out.print("7e ff 03 ");
        switch (pro) {
            case "IPCP":
                System.out.print(IPCP);
                break;
            case "LCP":
                System.out.print(LCP);
                break;
            case "PAP":
                System.out.print(PAP);
                break;
        }

        for (int i = 2; i < input.length; i++) {
            String current = input[i];
            if (current.equals("7e")) {
                System.out.print("7d 5e ");
            } else if (current.equals("7d")) {
                System.out.print("7d 5d ");
            } else if (0x20 > Integer.parseInt(current, 16)) {
                System.out.print(change(current)+" ");
            } else {
                System.out.print(current + " ");
            }
        }
        System.out.print("ff ff 7e");
    }

    private static String change(String current) {
        int a = Integer.parseInt(current, 16);
        a += 16*2;

        return "7d "+Integer.toHexString(a);
    }

}
