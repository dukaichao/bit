package bit_07_13;

import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:将十六进制转换为10进制
 * User:Mr.Du
 * Date:2019/7/13
 * Time:8:16
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            str = str.substring(2);
            int index = 0;
            int res = 0;
            for(int i = str.length()-1;i>=0;i--){
                if(Character.isDigit(str.charAt(i)))
                    res += Integer.valueOf(str.charAt(i)-48) * (int) Math.pow(16, index++);
                else
                    res += Integer.valueOf(str.charAt(i)-55) * (int) Math.pow(16, index++);
            }
            System.out.println(res);
        }
    }
}
