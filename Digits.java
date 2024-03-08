import java.util.ArrayList;
import java.util.Stack;

public class Digits {
    private ArrayList<Integer> digits;
    public Digits(int number){
        digits = new ArrayList<>();
        int unArrayed = number;
        Stack<Integer> s = new Stack<>();
        while (unArrayed>0){
            int newDigit = unArrayed%10;
            //System.out.println("new digit: " + newDigit);
            s.push(newDigit);
            unArrayed/=10;
            //System.out.println("unarrayed: " + unArrayed);
        }
        while(!s.empty()){
            digits.add(s.pop());
        }
        // System.out.println("The digits are:");
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
        int prevDigit = digits.get(0);
        for(int digit:digits){
            if(digit<=prevDigit){
                return false;
            }
            prevDigit=digit;
        }
        return true;
    }
}
