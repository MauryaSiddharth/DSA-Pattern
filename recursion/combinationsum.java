import java.util.ArrayList;
import java.util.List;

public class combinationsum {
    public static void main(String[] args) {
        int [] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
        
    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
              List<List<Integer>> result = new ArrayList<>();
              List<Integer> current = new ArrayList<>();
              if(candidates.length==0 || candidates==null){
                return result;
              }
              int sum  = 0;
              fun(candidates, target, sum, 0, result, current);

              return result;

    }

    static void fun(int [] candidates , int target , int sum , int idx , List<List<Integer>>result , List<Integer>current){
        if (sum == target){
             result.add(new ArrayList<>(current));
            return;
        }
        if (idx == candidates.length || sum > target) {
    return;
}

        
           current.add(candidates[idx]);
          fun(candidates, target, sum + candidates[idx], idx, result, current);
         current.remove(current.size() - 1);

         

       
         fun(candidates, target, sum, idx+1, result, current);
         

         return;
    }

    
}
