public class jumpgame{
    public static void main(String[] args) {
        int [] arr = {2,3,1,1,4}; 
        // int [] arr = {1,0,3,4};
        System.out.println(jump(arr));

    }
    static boolean jump(int [] arr){
        int n = arr.length;
        int reach = 0;
        
        for(int i =0;i< arr.length ;i++){
            if(reach<i){
                return false;
            } 
           reach = Math.max(reach,i+arr[i]);
           if(reach>=n-1){
            return true;
           }
        }
        return false;
    }
}