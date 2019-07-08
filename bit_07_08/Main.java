package bit_07_08;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:Hello World Here I Come
 * User:Mr.Du
 * Date:2019/7/8
 * Time:8:38
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String s = sc.nextLine();
            String[] str = s.split(" ");
            StringBuffer sb = new StringBuffer();
            for(int i = str.length-1;i>=0;i--){
                sb.append(str[i]+" ");
                System.out.println(sb);
            }
            System.out.println("***********************");
            System.out.println(sb);
        }
    }
}
