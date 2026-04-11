import java.util.*;
public class mostwater{
    // https://leetcode.com/problems/container-with-most-water/description/ 
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxarea(height));

    }
    static int  maxarea(int[] height){
        int  left=0;
        int right = height.length-1;
        int max = 0;

        while(left<right){
            int width = right-left;
            int h = Math.min(height[left],height[right]);
            int area  = width * h;
            if(area>max){
                max=area;
            }
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max;
    }
}