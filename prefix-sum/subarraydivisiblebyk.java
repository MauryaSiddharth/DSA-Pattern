import java.util.HashMap;

public class subarraydivisiblebyk {
    public static void main(String[] args) {
        int [] nums ={4,5,0,-2,-3,1};
        int k =5;
        // o/p =7
       System.out.println( subarraysDivByK(nums, k));
        
    }
    static int subarraysDivByK(int [] nums,int k){
        int n = nums.length;
        int prefix_sum=0;
        int ans =0;
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        for(int i =0 ;i<n;i++){
            prefix_sum+= nums[i];
            int rem= prefix_sum%k;

            if(rem<0){
                rem= rem+k;
            }

            if(map.containsKey(rem)){
                ans += map.get(rem);

            }

            map.put(rem,map.getOrDefault(rem, 0)+1);
        }
       
        return ans;
 
    }
    
}
