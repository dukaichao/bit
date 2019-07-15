package bit_07_14;
import java.util.*;
/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/7/15
 * Time:13:46
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (sc.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for(int i = 0;i<n;i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                if(arr[i][0] == 1){
                    list.add(arr[i][1]);
                    int max = getMax(list);
                    int sum = getSum(list,max);
                    if(max<sum) System.out.println("Yes");
                    else System.out.println("No");
                }else{
                    list = getList(list,arr[i][1]);
                    int max = getMax(list);
                    int sum = getSum(list,max);
                    if(max<sum) System.out.println("Yes");
                    else System.out.println("No");
                }
            }
        }
    }
    //删除一个数
    public static List<Integer> getList(List<Integer> list,int remove){
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            int tmp = it.next();
            if(tmp == remove){
                it.remove();
                break;
            }
        }
        return list;
    }
    //得到集合最大值
    public static int getMax(List<Integer> list){
        int res = list.get(0);
        for(int i : list){
            res = res > i?res:i;
        }
        return res;
    }
    //得到除了最大值的和
    public static int getSum(List<Integer> list,int max){
        int sum = 0;
        for(int i : list){
            sum += i;
        }
        return sum - max;
    }
}
