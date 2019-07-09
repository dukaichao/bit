package bit_07_09;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019/7/8
 * Time:22:26
 */
public class Solution {
    static int countTwo(int n){

        if(n<=0)return 0;
        int round=n,weight,base=1;
        int count=0;
        while(round!=0){
            weight=round%10;
            round/=10;
            count+=round*base;
            if(weight==2)
                count+=(n%base)+1;
            if(weight>2)
                count+=base;
            base*=10;
        }
        return count;
    }
}
