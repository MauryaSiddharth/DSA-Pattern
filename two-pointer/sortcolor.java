import java.util.Arrays;

public class sortcolor {
    public static void main(String[] args) {
        int [] nums= {2,0,2,1,1,0};
        sortcolor(nums);
          System.out.println(Arrays.toString(nums));
       
    }
    static void swap (int [] nums,int pos1,int pos2){
        int temp = nums[pos1];
        nums[pos1]=nums[pos2];
        nums[pos2]= temp;
    }
    //  dutch national flag
    //  time complexity o(N) and space o(1)
    static void sortcolor(int [] nums){
       int start=0;
       int mid =0;
       int end = nums.length-1;
       while(mid<=end){

        switch (nums[mid]) {
            case 0:
                //  swap with start index
                swap(nums,start,mid);
                 mid++;
                 start++;
                
                break;
             case 1:
                mid++;
                break;
                
             
             case 2:
                // swap with end index
                swap (nums,mid,end);
                end--;
                break;
        
            
        }
       }


    }


}
