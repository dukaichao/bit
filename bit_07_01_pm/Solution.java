package bit_07_01_pm;

import java.util.*;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-07-01
 * Time:20:14
 */
public class Solution {
    private static List<String> list = new ArrayList<>();
    private static List<String> list1 = new ArrayList<>();
    private static Map<String,Integer> mp = new HashMap<>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = Integer.parseInt(sc.nextLine());
            for(int i = 0;i<n;i++){
                AddCandidate(sc.next());

            }
            String ss = sc.nextLine();
            int m = Integer.parseInt(sc.nextLine());
            for(int i = 0;i<m;i++){
                Vote(sc.next());
            }
            ss = sc.nextLine();
            int sum = 0;
            for(String s : list){
                int t = GetVoteResult(s);
                if(t == -1){
                    break;
                }else {
                    System.out.println(s+" : "+ t);
                }
            }
            Iterator<String> it = list1.iterator();
            while(it.hasNext()){
                String s = it.next();
                if(list.contains(s))
                    it.remove();
            }
            for(String s : list1){
                sum += mp.get(s);
            }
            //if(sum>0)
            System.out.println("Invalid : "+sum);
            Clear();
        }
    }

    public static int AddCandidate(String s){
        if(list.contains(s)){
            return 0;
        }
        list.add(s);
        return 1;
    }

    public static void Vote(String s){
        list1.add(s);
        if(mp.containsKey(s)){
            int t = mp.get(s);
            mp.put(s,++t);
        }else{
            mp.put(s,1);
        }
    }

    public static int GetVoteResult(String s){
        if(list1.contains(s)){
            return mp.get(s);
        }
        return 0;
    }

    public static void Clear(){
        mp = null;
        list = null;
        list1 = null;
    }
}
