// longest increasing subsequence tabulation
public class list{
  public static void main(String[] args) {
    int [] nums={4,1,2,5};
    System.out.println(length(nums));
  }
  static int length (int [] nums){
    int n = nums.length;
    int [] res = new int[n];
    for(int i = 0; i<n;i++){
        res[i]=1;
        for(int j = 0;j<i;j++){
        if(nums[j]<nums[i]){
            res[i]=Math.max(res[i],res[j]+1);
        }
        }
    }
    int len =0;
    for(int i = 0;i<res.length;i++){
        if(res[i]>len){
            len=res[i];
        }
    }
    return  len;

    
  }
}