package demo;

/**
 * Created by Administrator on 2016/9/26.
 */
public class Main {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abc").append(" ").append("hhh");
        sb.deleteCharAt(2);
        System.out.println(sb);
        System.out.println(fun());
    }

    private static int fun() {
        try{
            return 0;
        } finally {
//            return 1;
        }

    }
}
