package bit_07_28;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:给定一个 24 小时制（小时:分钟）的时间列表，找出列表中任意两个时间的最小时间差并已分钟数表示。
 *
 *
 * 示例 1：
 *
 * 输入: ["23:59","00:00"]
 * 输出: 1
 *
 * 备注:
 *
 * 列表中时间数在 2~20000 之间。
 * 每个时间取值在 00:00~23:59 之间。
 *
 * User:Mr.Du
 * Date:2019/7/28
 * Time:9:36
 */
public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("00:00");
        list.add("23:00");
        list.add("00:00");
        list.add("00:00");
        list.add("00:00");
        System.out.println(findMinDifference(list));
    }

    public static int findMinDifference(List<String> list) {
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        int len = list.size();
        for(int i = 1;i<len;i++){
            int s1 = Integer.parseInt(list.get(i).split(":")[0]) * 60 +
                    Integer.parseInt(list.get(i).split(":")[1]);
            int s2 = Integer.parseInt(list.get(i-1).split(":")[0]) * 60 +
                    Integer.parseInt(list.get(i-1).split(":")[1]);
            int res1 = s1 - s2;
            if(res1 > 12 * 60){
                res1 = 24 * 60 - res1;
            }
            min = min < res1 ? min : res1;
        }
        int s1 = Integer.parseInt(list.get(len-1).split(":")[0]) * 60 +
                Integer.parseInt(list.get(len-1).split(":")[1]);
        int s2 = Integer.parseInt(list.get(0).split(":")[0]) * 60 +
                Integer.parseInt(list.get(0).split(":")[1]);
        int res1 = s1 - s2;
        if(res1 > 12 * 60){
            res1 = 24 * 60 - res1;
        }
        return min < res1 ? min : res1;

    }
}
