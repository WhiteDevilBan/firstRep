package tsz;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/9/10.
 */
public class Main {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int m = in.nextInt();

        int result  = -1;
        for(int i=l;i<=r;i++){
            int a = i;
            int count=0;
            while(a>0){
                count++;
                a=a&(a-1);
            }
            if(count == m){
                result++;
            }
        }
        System.out.println(result>=0?result+1:result);
    }
}
