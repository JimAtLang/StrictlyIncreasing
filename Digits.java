import java.util.ArrayList;
import java.util.Stack;

public class Digits {
    private ArrayList<Integer> digits; //an empty space where the arraylist will go
    public Digits(int number){
        digits = new ArrayList<>(); //puts an empty arraylist in the empty space
        // this will put the digits backward!
        while(number > 0){
            digits.add(number%10);
            number = number/10;
        }
        // debug lines:
        // for(int digit:digits){
        //     System.out.println(digit);
        // }
    }
    public ArrayList<Integer> getDigits() {
        return digits;
    }
    public void setDigits(ArrayList<Integer> digits) {
        this.digits = digits;
    }
    public int getDigit(int n){
        return digits.get(n);
    }
    public boolean isStrictlyIncreasing(){
        int n = digits.size()-1;//position of the last item in list
        int biggest = 0;
        while(n>=0){
            if(digits.get(n)>biggest){
                biggest = digits.get(n);
                n-=1;
            } else {
                return false;
            }
        }
        return true;
    }
}
