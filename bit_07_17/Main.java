package bit_07_17;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/7/17
 * Time:15:02
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            StringBuffer sb = new StringBuffer();
            String a = in.nextLine();
            String b = in.nextLine();
            for(int i = 0;i<a.length();i++){
                if(!b.contains(a.charAt(i)+"")){
                    sb.append(a.charAt(i));
                }
            }
            System.out.println(sb);
        }
    }
}
