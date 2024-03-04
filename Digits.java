import java.util.ArrayList;
import java.util.Stack;

public class Digits {
    private ArrayList<Integer> digits;
    public Digits(int number){
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
        return false;
    }
}
