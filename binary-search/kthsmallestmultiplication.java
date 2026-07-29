public class kthsmallestmultiplication {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int k = 5;
        System.out.println(findKthNumber(m, n, k));
    }
    static int findKthNumber(int m, int n, int k) {
        
        int low = 1;
        int high = m*n;
        int res  = -1;
        while(low<=high){
            int mid =(low+high)/2;
            int ans = fun(m, n, mid);

            if(ans<k){
                low=mid+1;
            }
            else{
                res = mid;
                high=mid-1;
            }

        }
         return res;       
    }
    static int fun(int m ,int n,int mid){
        int count = 0;
        for(int i = 1 ; i<= m;i++){
           count += Math.min(n, mid / i);
        }
     return count;
    }
}
