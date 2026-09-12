public class uniquepath{
     public static void main(String[] args) {
        int m = 3;
        int n =7;
        System.out.println(uniquePaths(m, n));
       
        
    }
     static int uniquePaths(int m, int n) {

     return  fun(0, 0, m, n);        
    }
   static int fun(int i , int j , int m , int n){
      if(i==m-1 && j ==n-1){
         return 1;
      }
      if(i<0 || i>=m ||j<0 || j>=n ){
        return 0;
      }
      return fun(i+1, j, m, n)+fun(i, j+1, m, n);
   }
}