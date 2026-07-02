import java.util.ArrayList;
import java.util.Stack;

public class greaterelement{
    public static void main(String[] args){
           int []arr = {4,1,2,5,3};
           System.out.println(prevgreater(arr));
    }

    //  prev greater element
    static ArrayList<Integer> prevgreater(int []arr){
        int n = arr.length;
        ArrayList<Integer>array = new ArrayList<>();
        array.add(-1);
        Stack<Integer>stack = new Stack<>();
        stack.push(arr[0]);
        for(int i =1 ; i < n;i++){
            while(!stack.isEmpty() && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                array.add(i,-1);
            }

            else{
                array.add(i,stack.peek());
            }

            stack.push(arr[i]);


        }

        return array;
    
    }
}