package bit_07_06;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:对长度超过1000的数字进行排序
 * User:Mr.Du
 * Date:2019-07-03
 * Time:23:44
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            String n = sc.next();
            List<BigInteger> list = new ArrayList<>();
            for(int i = 0;i<Integer.parseInt(n);i++)
                list.add(new BigInteger(sc.next()));
            Collections.sort(list);
            for(BigInteger bi : list){
                System.out.println(bi.toString());
            }

        }

    }
}
