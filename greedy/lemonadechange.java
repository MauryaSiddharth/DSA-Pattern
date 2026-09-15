package greedy;

public class lemonadechange {
    public static void main(String[] args) {
            int []bills = { 5,5,5,10,20};
            System.out.println(lemonadechange(bills));

    } 
    static boolean lemonadechange(int [] bills){
        int n = bills.length;
        int five =0;
        int ten = 0;

        for(int  i= 0; i<n ; i++){
            int money = bills[i];
            if(money ==5){
                five++;
            }
            else if(money==10){
                if(five==0){
                    return false;
                }
                five--;
                ten++;
            }

            else if (money==20){
                if(ten>0){
                    ten--;
                    if(five==0){
                        return  false;
                    }
                    five--;
                }
                else{
                    if(five<3){
                        return false;
                    }
                    five = five-3;
                }

            }

        }
        return true;
    }
 }
