import java.util.HashMap;

public class contiguiousarray {
    public static void main(String[] args) {
        int [] nums = {0,1};
        //  o/p =2;
        System.out.println(fixMaxLength(nums));

    }
    static int fixMaxLength(int [] nums){
        int n  = nums.length;
        int zero =0;
        int one =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        int res=0;
        for(int i =0 ; i< n; i++){
            if(nums[i]==0){
                zero++;
            }
            else{
                one++;
            }

            int diff = zero-one;

            if(diff==0){
                res= Math.max(res,i+1);
                continue;
            }

            if(map.containsKey(diff)){
                int idx= map.get(diff);
                int len = i-idx;
                res= Math.max(len,res);
            }
            else{
                map.put(diff,i);
            }
        }
        return res;
    }
     
}
