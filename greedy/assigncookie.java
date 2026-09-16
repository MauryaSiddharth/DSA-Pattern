import java.util.Arrays;

public class assigncookie{
    public static void main(String[] args){
        int []g = {1,3,5};
        int s[] = {4,2};
        System.out.println(assign(g,s));
    }
    static int assign(int[] g , int []s ){
        
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0;
        int i=0;
        int j = 0;
        while(i<g.length && j <s.length){
            if(s[j]>=g[i]){
                res++;
                i++;
                j++;
            }
            else{
                j++;
            }

        }
        return res;
    }
}