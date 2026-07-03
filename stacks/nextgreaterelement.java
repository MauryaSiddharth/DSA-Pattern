import java.util.Arrays;
import java.util.Stack;

public class nextgreaterelement {
    // https://leetcode.com/problems/next-greater-element-ii/

    public static void main(String[] args) {
        
        int [] nums ={1,2,1};
        //  op  [2,-1,2]
        
        int [] ans = nextGreaterElements(nums);
        System.out.println(Arrays.toString(ans));
    }
     static int[] nextGreaterElements(int[] nums) {
        int n= nums.length;
        Stack<Integer>stack = new Stack<>();
        int [] res = new int[n];
        
        for(int i = n-2;i>=0 ; i--){
            stack.push(nums[i]);
        }

        for(int i = n-1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                res[i]=-1;
            }

            else{
                res[i]=stack.peek();
            }
            
            stack.push(nums[i]);
        }
        return res;
    }
}
