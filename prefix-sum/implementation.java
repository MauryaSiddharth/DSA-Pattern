import java.util.ArrayList;

public class implementation {
  public static void main(String[] args) {
    int [] arr = {10,20,30,5,15};
    ArrayList <Integer> prefixSum = prefSum(arr);
    for(int i = 0 ; i < prefixSum.size(); i++){
        System.out.print( prefixSum.get(i) + " ");
    }
    
  }

  static ArrayList<Integer>prefSum ( int [] arr){
    int n = arr.length;
    ArrayList<Integer> prefixSum = new ArrayList<>();

    prefixSum.add(arr[0]);

    for(int i = 1 ; i < n ; i++){
        prefixSum.add(prefixSum.get(i-1)+arr[i]);

    }
    return prefixSum;

  }
    
}