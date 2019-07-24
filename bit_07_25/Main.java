package bit_07_25;

import java.util.HashMap;
import java.util.Map;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:数组中出现的众数，有就返回，没有返回0
 * User:Mr.Du
 * Date:2019/7/25
 * Time:0:42
 */
public class Main {
    public int MoreThanHalfNum_Solution(int [] array) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i = 0;i<array.length;i++){
            if(mp.containsKey(array[i])){
                int count = mp.get(array[i]);
                mp.put(array[i],++count);
            }else{
                mp.put(array[i],1);
            }
        }
        int n = array.length / 2;
        for(Map.Entry<Integer,Integer> e : mp.entrySet()){
            if(e.getValue()>n){
                return e.getKey();
            }
        }
        return 0;
    }
}
