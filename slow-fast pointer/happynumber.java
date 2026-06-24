public class happynumber {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(checkhappy(n));

    }
   static  boolean checkhappy(int n){
       int slow = n ;
       int fast= n;

       while(fast!=1){
        slow = Sum(slow);
        fast = Sum(fast);
        fast= Sum(fast);

        if(slow==fast && slow!=1){
            return false;
        }
        
       }
       return true;
    }


     private static int Sum(int n){
        int sum =0;
        while(n>0){
            int digit = n%10;
             sum=sum+digit*digit;
            n= n/10;
        

        }
        return sum;

     }

}
