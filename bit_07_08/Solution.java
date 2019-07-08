package bit_07_08;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * 开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
 *
 * 处理：
 *
 * 1、 记录最多8条错误记录，循环记录，对相同的错误记录（净文件名称和行号完全匹配）只记录一条，错误计数增加；
 *
 * 2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
 *
 * 3、 输入的文件可能带路径，记录文件名称不能带路径。
 *
 * 输入描述:
 * 一行或多行字符串。每行包括带路径文件名称，行号，以空格隔开。
 *
 * 输出描述:
 * 将所有的记录统计并将结果输出，格式：文件名 代码行数 数目，一个空格隔开，如：
 *
 * 示例1
 * 输入
 * E:\V1R2\product\fpgadrive.c   1325
 * 输出
 * fpgadrive.c 1325 1
 *
 * User:Mr.Du
 * Date:2019/7/8
 * Time:10:22
 */
public  class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new LinkedHashMap<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            if(s == null || "".equals(s)) break;
            String[] split = s.split("\\s");
            System.out.println(split.length);
            String key = split[0].substring(split[0].lastIndexOf('\\') + 1) + " " + split[1];
            map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        for (int i = 0; i < 8; i ++) {
            String[] split = list.get(i).getKey().split("\\s");
            if(split[0].length() > 16) split[0] = split[0].substring(split[0].length() - 16);
            System.out.println(split[0] + " " + split[1] + " " + list.get(i).getValue());
        }
    }
}





