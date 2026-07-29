public class allocateminimumpages {
       //  asked in samsung r&d
    
    public static void main(String[] args) {
        int [] arr = {12,34,67,90};
        int k =2;
        System.out.println(findPages(arr, k));
    }
    static int findPages(int [] arr, int k){
        int n = arr.length;
        int res = -1;
        if(n<k){
            return -1;
        }
        int low = arr[0];
    for (int pages : arr) {
        low = Math.max(low, pages);
    }
    int high = 0;
    for (int pages : arr) {
        high += pages;
    }
       while(low<=high){
        int mid =low + (high - low) / 2;
        if(fun(arr, k, mid)){
            res= mid;
            high = mid-1;
        }
        else{
            low= mid+1;
        }
       }
       return res;

    }

    static boolean fun(int [] arr, int k , int mid ){
        int student =1;
        int page = 0;
        for(int i =0 ; i < arr.length;i++){
            if(page+arr[i]<=mid){
                page = page+arr[i];
            }
            else{
                student++;
                page=arr[i];
                if(student>k){
                    return false;
                }
            }
        }
        return true;
    }
}
